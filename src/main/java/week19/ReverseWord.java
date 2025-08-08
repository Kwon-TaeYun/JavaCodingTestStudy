package week19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord {
    public static String solution(String s) {
        String answer = "";
        List<String> list = Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (String str : list) {
            answer += str;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
