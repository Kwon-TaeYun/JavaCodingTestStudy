package week28;

import java.util.Scanner;

public class Score {
    public static int solution(int n, int[] arr){
        int answer = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count = 0;
            }else{
                count++;
                answer+= count;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 첫 줄 입력

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
