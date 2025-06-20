package week12;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Process {
    public static int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++){
            queue.add(new int[]{i, priorities[i]});
        }

        int count = 0;

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            boolean hasHigher = false;
            for (int[] q : queue) {
                if(q[1] > poll[1]){
                    hasHigher = true;
                    break;
                }
            }

            if(hasHigher){
                queue.add(poll);
            }else{
                count++;
                if(poll[0] == location){
                    return count;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int answer = solution(priorities, location);
        System.out.println("answer ::: " + answer);
    }
}
