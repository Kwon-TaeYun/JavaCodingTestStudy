package week28;

import java.util.Scanner;

public class PickOnlyNumber {
    public static int solution(String sentence) {
        return Integer.parseInt(sentence.replaceAll("[^0-9]", ""));
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

//[A-Z]	A부터 Z까지의 대문자 알파벳 :: 부정 [^A-Z]
//[a-z]	a부터 z까지의 소문자 알파벳
//[0-9]	0부터 9까지의 숫자
}
