package week28;

import java.util.Arrays;
import java.util.Scanner;

public class XYSort {
    public static int[][] solution(int[][] moves){
        Arrays.sort(moves, (a, b)->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        return moves;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(); // 입력 줄 수

        int[][] moves = new int[m][2]; // 2차원 배열 생성

        for (int i = 0; i < m; i++) {
            moves[i][0] = in.nextInt(); // 첫 번째 숫자
            moves[i][1] = in.nextInt(); // 두 번째 숫자
        }

        int[][] result = solution(moves);

        for (int[] res : result) {
            System.out.println(res[0] + " " + res[1]);
        }

    }
}
