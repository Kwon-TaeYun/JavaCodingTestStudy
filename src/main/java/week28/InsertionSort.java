package week28;

import java.util.Scanner;

public class InsertionSort {
    public static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n; i++){
            int tmp = arr[i], j;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
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
