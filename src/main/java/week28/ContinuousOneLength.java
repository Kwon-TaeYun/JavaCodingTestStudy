package week28;

import java.util.Scanner;

public class ContinuousOneLength {
    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        int left = 0;
        int zeroCount = 0;
        for(int right = 0; right < n; right++){
            if(arr[right] == 0){
                zeroCount++;
            }
            while(zeroCount > m){
                if(arr[left] == 0) zeroCount--;
                left++;
            }

            answer = Math.max(right - left + 1, answer);
        }
        //1 1 0 0 1 1 0 1 1 0 1 1 0 1
        //        l             r
        return answer;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
