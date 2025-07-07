package week15;

import java.util.Arrays;

public class StringinString {
    public static String solution(String my_string) {
        String answer = "";
        String lower = my_string.toLowerCase();
        char[] charArray = lower.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));

    }
}
