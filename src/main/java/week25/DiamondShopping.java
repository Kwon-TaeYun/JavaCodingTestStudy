package week25;

import java.util.*;

public class DiamondShopping {
    public static int[] solution(String[] gems) {
        Set<String> gemSet = new HashSet<>();
        Map<String, Integer> gemCount = new HashMap<>();
        int start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        int[] answer = new int[2];

        for (String gem : gems) {
            gemSet.add(gem);
        }
        int n = gemSet.size(); //4

        while(true) {
            if(gemCount.keySet().size() == n){
                if(end - start < minLength){
                    minLength = end - start;
                    answer[0] = start + 1;
                    answer[1] = end;
                }
                String startGem = gems[start];
                gemCount.put(startGem, gemCount.get(startGem) - 1);
                if(gemCount.get(startGem) == 0){
                    gemCount.remove(startGem);
                }
                start++;

            }else{
                if(end == gems.length) break;
                gemCount.put(gems[end], gemCount.getOrDefault(gems[end], 0) + 1);
                end++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        System.out.println(Arrays.toString(solution(gems)));
    }
}
