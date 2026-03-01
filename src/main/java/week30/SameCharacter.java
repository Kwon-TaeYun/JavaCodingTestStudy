package week30;

import java.util.*;

public class SameCharacter {
    public int[] solution(String s){
        int[] answer = new int[5];
        String tmp = "abcde";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        } // a : 3, b : 1, c : 1

        int max = 0;
        for (Character c : map.keySet()) {
            max = Math.max(map.get(c), max);
        } //3

        for(int i = 0; i < tmp.length(); i++){
            answer[i] = max - map.getOrDefault(tmp.charAt(i), 0);
        }



        return answer;
    }

    public static void main(String[] args){
        SameCharacter T = new SameCharacter();
        System.out.println(Arrays.toString(T.solution("aaabc")));
        System.out.println(Arrays.toString(T.solution("aabb")));
        System.out.println(Arrays.toString(T.solution("abcde")));
        System.out.println(Arrays.toString(T.solution("abcdeabc")));
        System.out.println(Arrays.toString(T.solution("abbccddee")));
    }

}
