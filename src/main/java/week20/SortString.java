package week20;

import java.util.Arrays;

public class SortString {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1,s2)->{
            if(s1.charAt(n) == s2.charAt(n)){
                return s1.compareTo(s2);
            }
            return Character.compare(s1.charAt(n), s2.charAt(n));
        });
        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        String[] solution = solution(strings, 1);
        System.out.println(Arrays.toString(solution));
    }
}
