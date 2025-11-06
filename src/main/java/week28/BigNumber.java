package week28;

import java.util.Scanner;

public class BigNumber {
    public static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0] + " ");
        for(int i = 1; i < n; i++){
            if(arr[i-1] < arr[i]){
                sb.append(arr[i] + " ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // solution 호출
        System.out.println(solution(n, arr));
    }
}
