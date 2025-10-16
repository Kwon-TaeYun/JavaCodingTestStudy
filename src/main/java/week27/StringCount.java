package week27;

import java.util.Map;
import java.util.TreeMap;

public class StringCount {
    public static Map<Character, Integer> solution(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(c >= 'a' && c <= 'z'){
                sb.append(c);
            }
        }
        for (char c : sb.toString().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello World!!!"));
    }
}
