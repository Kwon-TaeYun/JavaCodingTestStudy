package week13;

import java.util.HashMap;
import java.util.Map;

public class Mode {
    public static int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int most = 0;
        int maxCount = 0;
        boolean isDuplicated = false;
        for (Integer k : map.keySet()) {
            if(map.get(k) > maxCount){
                most = k;
                maxCount = map.get(k);
                isDuplicated = false;
            }else if(map.get(most).equals(map.get(k))){
                isDuplicated = true;
            }
        }
        return isDuplicated ? -1 : most;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2};
        System.out.println("array::" + solution(array));
    }
}
