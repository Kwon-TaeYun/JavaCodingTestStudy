package week28;

import java.util.Scanner;

public class CrossSum {
    public static int solution(int[][] arr, int n){
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n - 1 - i];
        }
        answer = Math.max(sum2, sum1);

        int sum3;
        int sum4;
        for(int i = 0; i < n; i++){
            sum3 = 0;
            sum4 = 0;
            for(int j = 0; j < n; j++){
                sum3 += arr[i][j];
                sum4 += arr[j][i];
            }
            answer = Math.max(answer,Math.max(sum3, sum4));
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(arr, n));

    }
}
