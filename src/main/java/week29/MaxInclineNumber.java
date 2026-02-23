package week29;

import java.util.Scanner;

public class MaxInclineNumber {
    public static int solution(int n, int[] arr){
        int[] dy = new int[n];
        dy[0] = 1;
        for(int i = 1; i < n; i++){
            dy[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]){
                    dy[i] = Math.max(dy[i], dy[j] + 1);
                }
            }
        }
        int max = 0;

        for(int i = 0; i < n; i++){
            max = Math.max(dy[i], max);
        }

        return max;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
