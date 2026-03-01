package week30;

import java.util.HashMap;
import java.util.Map;

public class OnlyOneCharacter {
    public int solution(String s){
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if(map.get(c) == 1) return s.indexOf(c) + 1;
        }

        return -1;
    }

    public static void main(String[] args){
        OnlyOneCharacter T = new OnlyOneCharacter();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }

}
