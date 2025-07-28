package week18;

import java.util.Arrays;

public class FindKim {
    public static String solution(String[] seoul) {
        String answer = "";
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index +"에 있다";
    }
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String solution = solution(seoul);
        System.out.println(solution);
    }
}
