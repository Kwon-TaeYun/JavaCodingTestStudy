package week28;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int solution(int n, int[] arr){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == n) return mid + 1;
            else if(arr[mid] > n){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1;
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
