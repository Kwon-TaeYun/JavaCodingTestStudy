package week27;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Programming {
    public int[] solution(int [][] v){
        int[] answer = new int[2];
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for(int i = 0; i < v.length; i++){
            xMap.put(v[i][0], xMap.getOrDefault(v[i][0], 0) + 1);
            yMap.put(v[i][1], yMap.getOrDefault(v[i][1], 0) + 1);
        }

        Set<Integer> xMapKeySet = xMap.keySet();
        Set<Integer> yMapKeySet = yMap.keySet();
        for (Integer num : xMapKeySet) {
            if(xMap.get(num) == 1){
                answer[0] = num;
                break;
            }
        }
        for (Integer num : yMapKeySet) {
            if(yMap.get(num) == 1){
                answer[1] = num;
                break;
            }
        }

        return answer;
    }
}
