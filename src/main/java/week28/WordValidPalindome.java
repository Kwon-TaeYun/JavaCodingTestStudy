package week28;

import java.util.Scanner;

public class WordValidPalindome {
    public static String solution(String sentence) {
        String tmp1 = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String tmp2 = new StringBuilder(tmp1).reverse().toString();
        System.out.println(tmp1 + "::" + tmp2);
        if(tmp1.equals(tmp2)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }
}

//정규포현식 정리 필요!!!

