package week24;

import java.util.*;

public class NewsClustering {
    public static List<String> makeMultiSet(String str){
        ArrayList<String> multiSet = new ArrayList<>();
        for(int i = 0; i < str.length() - 1; i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(i+1);
            if(Character.isLetter(c1) && Character.isLetter(c2)){
                multiSet.add("" + c1 + c2);
            }
        }

        return multiSet;
    }

    public static int solution(String str1, String str2) {
        double answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> multiset1 = makeMultiSet(str1);
        List<String> multiset2 = makeMultiSet(str2);

        if (multiset1.isEmpty() && multiset2.isEmpty()) return 65536; // 공집합 예외
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String m1 : multiset1) {
            map1.put(m1, map1.getOrDefault(m1, 0) + 1);
        }
        for (String m2 : multiset2) {
            map2.put(m2, map2.getOrDefault(m2, 0) + 1);
        }

        //교집합 계산
        int intersection = 0;
        for (String key : map1.keySet()) {
            if(map2.containsKey(key)){
                intersection += Math.min(map1.get(key), map2.get(key));
            }
        }

        //합집합 계산
        int union = 0;
        Set<String> allKeySet = new HashSet<>();
        allKeySet.addAll(map1.keySet());
        allKeySet.addAll(map2.keySet());
        for (String key : allKeySet) {
            union += Math.max(map1.getOrDefault(key, 0), map2.getOrDefault(key, 0));
        }

        answer = (double) intersection / union;

        return (int)(answer * 65536);
    }

    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "french"));
    }
}
