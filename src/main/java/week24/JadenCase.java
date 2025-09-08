package week24;

import java.util.Arrays;

public class JadenCase {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] token = s.split(" ");
//        System.out.println(Arrays.toString(token));
        for (String t : token) {
            t = t.replaceFirst(t.substring(0, 1), t.substring(0, 1).toUpperCase());
            answer.append(t);
            answer.append(" ");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }
}
