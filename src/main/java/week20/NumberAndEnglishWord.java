package week20;

import java.util.HashMap;
import java.util.Map;

public class NumberAndEnglishWord {
    public static int solution(String s) {
        int answer = 0;
        String temp = "";
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);map.put("one", 1);
        map.put("two", 2);map.put("three", 3);
        map.put("four", 4);map.put("five", 5);
        map.put("six", 6);map.put("seven", 7);
        map.put("eight", 8);map.put("nine", 9);

        String[] token = s.split("");
        for (String t : token) {
            if (Character.isDigit(t.charAt(0))) { // 숫자면 바로 append
                sb.append(t);
            } else {
                temp += t; // 숫자가 아니면 temp에 누적
                if (map.containsKey(temp)) { // 단어가 완성되면 변환 후 temp 초기화
                    sb.append(map.get(temp));
                    temp = "";
                }
            }
        }


        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}
