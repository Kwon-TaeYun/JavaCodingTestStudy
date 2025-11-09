package week28;

import java.util.Scanner;

public class BubbleSort {
    public static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for (int i : arr) {
            sb.append(i + " ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m = in.nextInt();

        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution(m, moves));
    }
}
