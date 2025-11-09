package week28;

import java.util.Arrays;
import java.util.Scanner;

public class HorseHouse {
    public static int possible(int target, int[] arr){
        int cnt = 1;
        int cur = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - cur >= target){
                cnt++;
                cur = arr[i];
            }
        }

        return cnt;
    }
    public static int solution(int N, int C, int[] arr){
        Arrays.sort(arr);
        int left = arr[0];
        int right = arr[N-1];
        int answer= 0;
        while(left <= right){
            int mid = (left + right)/2;
            if(possible(mid, arr) >= C){
                left = mid + 1;
                answer = mid;
            }else{
                right = mid - 1;
            }
        }

        return answer;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(); // 입력 줄 수
        int n = in.nextInt();

        int[] moves = new int[m]; // 2차원 배열 생성

        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt(); // 첫 번째 숫자
        }

        System.out.println(solution(m,n, moves));
    }
}
