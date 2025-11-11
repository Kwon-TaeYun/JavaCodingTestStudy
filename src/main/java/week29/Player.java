package week29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Player {
    public static int solution(int n, int[][] arr){
        int answer = 1;

        Arrays.sort(arr, (a, b)->{
            if(a[0] == b[0]) return b[1] - a[1];
            return b[0] - a[0];
        });

        int idx = 0;
        int max = arr[idx][1];

        for(int i = 1; i < arr.length; i++){
            if(max < arr[i][1]){
                answer++;
                max = arr[i][1];
                idx = i;
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
