package week28;

import java.util.Scanner;

public class CanSeeStudent {
    public static int solution(int n, int[] arr){
        int answer = 1;
        int maxStudent = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(maxStudent < arr[i]){
                maxStudent = arr[i];
                answer++;
            }
        }
        return answer;
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
