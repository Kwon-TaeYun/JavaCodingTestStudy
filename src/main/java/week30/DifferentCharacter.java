package week30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DifferentCharacter {
    public int solution(String s){
        int answer = 0;
        Map<Character, Integer> sH = new HashMap<>();
        Set<Integer> cH = new HashSet<>();
        for (char c : s.toCharArray()) {
            sH.put(c, sH.getOrDefault(c, 0) + 1);
        }

        for (Character ch : sH.keySet()) {
            while(cH.contains(sH.get(ch))){
                answer++;
                sH.put(ch, sH.get(ch) - 1);
            }
            if(sH.get(ch) == 0) continue;
            cH.add(sH.get(ch));
        }
        return answer;
    }

    public static void main(String[] args){
        DifferentCharacter T = new DifferentCharacter();
        System.out.println(T.solution("aaabbbcc"));
        System.out.println(T.solution("aaabbc"));
        System.out.println(T.solution("aebbbbc"));
        System.out.println(T.solution("aaabbbcccde"));
        System.out.println(T.solution("aaabbbcccdddeeeeeff"));
    }

}
