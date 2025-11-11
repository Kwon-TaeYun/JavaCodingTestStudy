package week29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Schedule {
    static class Lecture{
        int money;
        int day;

        public Lecture(int money, int day){
            this.money = money;
            this.day = day;
        }
    }

    public static int solution(int n, int[][] arr){
        int answer = 0;
        Arrays.sort(arr, (a, b)->{
            if(a[1] == b[1]){
                return b[0] - a[0];
            }
            return b[1] - a[1];
        });

        int maxDay = arr[0][1];

        ArrayList<Lecture> lecture = new ArrayList<>();
        for (int[] a : arr) {
            Lecture l = new Lecture(a[0], a[1]);
            lecture.add(l);
        }

        PriorityQueue<Lecture> pQ = new PriorityQueue<>((a,b)->b.money - a.money);
        int j = 0;
        for(int day = maxDay; day >= 1; day--){
            while(j < lecture.size() && lecture.get(j).day >= day){
                pQ.offer(lecture.get(j));
                j++;
            }

            if(!pQ.isEmpty()){
                Lecture cur = pQ.poll();
                answer += cur.money;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
