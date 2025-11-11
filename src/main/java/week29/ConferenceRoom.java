package week29;

import java.util.Arrays;
import java.util.Scanner;

public class ConferenceRoom {
    public static int solution(int n, int[][] arr){
        int answer = 1;

        Arrays.sort(arr, (a, b)->{
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

//        for (int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }
        int end = arr[0][1];
        for(int i = 1; i < n; i++){
            if(arr[i][0] >= end){
                answer++;
                end = arr[i][1];
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
