package week28;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {
    public static boolean possible(int n, int mid, int[] arr){
        int count = 1;
        int sum = 0;
        for (int a : arr) {
            if(sum + a > mid){
                count++;
                sum = a;
            }else{
                sum += a;
            }
        }

        return (count <= n);
    }
    public static int solution(int n, int[] arr){
        //n = 3;
        //arr = {1 2 3 4 5 6 7 8 9}
        int sum = Arrays.stream(arr).sum();
        int maxSong = 0;

        int left = Arrays.stream(arr).max().getAsInt(); // 중요!!!
        int right = sum;
        int answer = sum;

        while(left <= right){
            int mid = (left + right) / 2;
            if(possible(n, mid, arr)){
                answer = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
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

        System.out.println(solution(n, moves));
    }
}
