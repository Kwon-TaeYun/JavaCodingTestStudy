package week28;

import java.util.Scanner;

public class LRU {
    public static String solution(int n, int[] moves){
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for (int move : moves) {
            int pos = -1;
            for(int i = 0; i < n; i++){
                if(move == arr[i]){
                    pos = i;
                    break;
                }
            }

            if(pos != -1){
                for(int i = pos; i >= 1; i--){
                    arr[i] = arr[i-1];
                }
            }else{
                for(int i = n - 1; i >= 1; i--){
                    arr[i] = arr[i-1];
                }
            }

            arr[0] = move;
        }

        for (int i : arr) {
            sb.append(i + " ");
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution(n, moves));
    }
}
