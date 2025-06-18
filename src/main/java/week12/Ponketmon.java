package week12;

import java.util.HashMap;
import java.util.Set;

public class Ponketmon {
    public static int solution(int[] nums) {
        int answer = 0;
        HashMap<String, Integer> monster = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            monster.put(String.valueOf(nums[i]), monster.getOrDefault(String.valueOf(nums[i]), 0) + 1);
        }
//        System.out.println(monster);
        Set<String> monsterKeySet = monster.keySet();
        if(monsterKeySet.size() >= nums.length/2){
            return nums.length/2;
        }
        return monsterKeySet.size();
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int answer = solution(nums);
        System.out.println("answer ::: " + answer);
    }
}
