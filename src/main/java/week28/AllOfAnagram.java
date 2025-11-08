package week28;

import java.util.*;

public class AllOfAnagram {
    public static int solution(String str1, String str2){
        int answer = 0;
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> mMap = new HashMap<>();
        for(int i = 0; i < str2.length(); i++){
            tMap.put(str1.charAt(i), tMap.getOrDefault(str1.charAt(i), 0) + 1);
            mMap.put(str2.charAt(i), mMap.getOrDefault(str2.charAt(i), 0) + 1);
        }

        if(tMap.equals(mMap)) answer++;

        for(int i = 0; i < str1.length() - str2.length(); i++){
            tMap.put(str1.charAt(i), tMap.get(str1.charAt(i)) - 1);
            if(tMap.get(str1.charAt(i)) == 0) tMap.remove(str1.charAt(i));
            tMap.put(str1.charAt(i+str2.length()), tMap.getOrDefault(str1.charAt(i+str2.length()), 0) + 1);
            if(tMap.equals(mMap)) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
        return ;
    }
}
