package week28;

import java.util.Scanner;

public class ReverseWords {
    public static String solution(String word) {
        String answer = new StringBuilder(word).reverse().toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        in.nextLine(); // 개행 문자 제거 (★ 중요)

        String[] arr = new String[input1];
        for (int i = 0; i < input1; i++) {
            String input2 = in.nextLine();
            arr[i] = input2;
        }

        for (int i = 0; i < input1; i++) {
            System.out.println(solution(arr[i]));
        }
    }
}
