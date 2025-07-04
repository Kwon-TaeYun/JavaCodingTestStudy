package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimilarArray {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

        List<String> list = Arrays.asList(s2); // s2 배열을 List로 변환

        for (String str : s1) {
            if (list.contains(str)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(s1, s2));
    }
}
