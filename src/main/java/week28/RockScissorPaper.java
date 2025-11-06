package week28;

import java.util.Scanner;

public class RockScissorPaper {
    public static String solution(int n, int[] arr1, int[] arr2) {
        StringBuilder answer = new StringBuilder();
        String[][] result = new String[4][4];
        for(int i = 1; i < 4; i++){
            result[i][i] = "D";
        }

        result[1][2] = "B";
        result[1][3] = "A";
        result[2][1] = "A";
        result[2][3] = "B";
        result[3][1] = "B";
        result[3][2] = "A";

        for(int i = 0; i < n; i++){
            int a = arr1[i];
            int b = arr2[i];
            answer.append(result[a][b] + "\n");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 첫 줄 입력

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr1, arr2));
    }
}
