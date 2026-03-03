package week30;

import java.util.HashMap;
import java.util.Map;

public class ArrayInstanceOfMinus {
    public int solution(int[] nums, int m){
        int answer = 0;
        int sum = 0;
        Map<Integer, Integer> nH = new HashMap<>();
        nH.put(0, 1);
        for (int num : nums) {
            sum += num;
            if(nH.containsKey(sum - m)){
                answer += nH.get(sum - m);
            }
            nH.put(sum, nH.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args){
        ArrayInstanceOfMinus T = new ArrayInstanceOfMinus();
        System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));
        System.out.println(T.solution(new int[]{-1, 0, 1}, 0));
        System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));
    }

}
