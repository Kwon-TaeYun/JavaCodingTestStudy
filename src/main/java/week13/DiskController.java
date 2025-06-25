package week13;

import java.util.*;

public class DiskController {
    public static int solution(int[][] jobs) {
        int answer = 0;
        int finished = 0;
        int jobIndex = 0;
        int currentTime = 0;
        int totalTime = 0;
        List<int[]> jobList = new ArrayList<>();
        for(int i = 0; i < jobs.length; i++){
            jobList.add(new int[]{jobs[i][0], jobs[i][1], i});
        }

        jobList.sort(Comparator.comparingInt(a -> a[0])); //처음 써봄

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
          if(a[1] != b[1]) return a[1] - b[1];
          if(a[0] != b[0]) return a[0] - b[0];
          return a[2] - b[2];
        });

        while(finished < jobs.length){
            while (jobIndex < jobs.length && jobList.get(jobIndex)[0] <= currentTime) {
                pq.add(jobList.get(jobIndex));
                jobIndex++;
            }

            if(!pq.isEmpty()){
                int[] job = pq.poll();
                currentTime += job[1];
                totalTime += currentTime - job[0];
                finished++;
            }else{
                currentTime = jobList.get(jobIndex)[0];
            }
        }

        return totalTime/jobs.length;
    }

    public static void main(String[] args) {
        int[][] jobs = {{0,3},{1,9},{3,5}};
        int solution = solution(jobs);
        System.out.println(solution);
    }
}
