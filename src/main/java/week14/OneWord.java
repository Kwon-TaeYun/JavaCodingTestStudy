package week14;

import java.util.Map;
import java.util.TreeMap;

public class OneWord {
    public static String solution(String s) {
        String answer = "";
        Map<Character, Integer> treeMap = new TreeMap<>();
        for (Character c : s.toCharArray()) {
            treeMap.put(c, treeMap.getOrDefault(c, 0) + 1);
        }

        for (Character c : treeMap.keySet()) {
            if(treeMap.get(c) == 1){
                answer += c;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "hello";
        String solution = solution(s);
        System.out.println(solution);
    }
}
