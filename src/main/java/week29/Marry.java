package week29;

import java.util.Scanner;
public class Marry {
    public static int solution(int n, int[][] arr){
        int answer = 0;
        int[] time = new int[73];
        for (int[] t : arr) {
            time[t[0]] ++;
            time[t[1]] --;
        }

        int cur = 0;
        for(int i = 0; i < time.length; i++){
            cur += time[i];
            answer = Math.max(answer, cur);
        }

        return answer;
    } //누적합!!!

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
