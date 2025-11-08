package week28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Anagram {
    public static String solution(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        if(s1.length() != s2.length()){
            return "NO";
        }else {
            for (int i = 0; i < s1.length(); i++) {
                map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
                map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
            }

            Set<Character> set = map1.keySet();
            Set<Character> set1 = map2.keySet();
            if(set.size() != set1.size()) return "NO";
            else{
                for (Character s : set1) {
                    if(map1.get(s) != map2.get(s)) return "NO";
                }

                return "YES";
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
    }
}
