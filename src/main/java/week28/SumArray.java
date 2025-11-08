package week28;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static int[] solution(int[] arr, int[] arr2, int n, int m){
        int[] answer = new int[n+m];
        for(int i = 0; i < n; i++){
            answer[i] = arr[i];
        }

        for(int i = 0; i < m; i++){
            answer[n+i] = arr2[i];
        }

        Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        int[] solution = solution(arr, arr2, n, m);
        for(int i = 0; i < n+m; i++){
            System.out.print(solution[i] + " ");
        }

    }
}
