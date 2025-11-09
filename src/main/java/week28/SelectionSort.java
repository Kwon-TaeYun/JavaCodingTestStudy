package week28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SelectionSort {
    public static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n-1; i++){
            int idx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }

            int tmp =arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
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
