package week07.의상;

import java.util.HashMap;
import java.util.Set;

public class Clothes {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        Set<String> keySet = clothesMap.keySet();
        for (String s : keySet) {
            answer *= (clothesMap.get(s)+1);
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int output = solution(clothes);
        System.out.println(output);
    }
}
