package week30;
import java.util.*;

public class MaxLenContinuousNumber {
    public int solution(int[] nums){
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }//0,1,2,3,4,8,9,10

        for (Integer x : set) {
            if(set.contains(x-1)) continue;
            int cnt = 0;
            while(set.contains(x)){
                x++;
                cnt++;
            }

            answer = Math.max(cnt, answer);
        }

        return answer;
    }

    public static void main(String[] args){
        MaxLenContinuousNumber T = new MaxLenContinuousNumber();
        System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
        System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
        System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
        System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
    }

}
