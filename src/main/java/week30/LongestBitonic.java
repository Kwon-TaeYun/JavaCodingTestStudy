package week30;

import java.util.ArrayList;
import java.util.List;

public class LongestBitonic {
    public int solution(int[] nums){
        int answer = 0;
        List<Integer> peaks = new ArrayList<>();
        //1. peak 찾기
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                peaks.add(i);
            }
        }

        for (Integer x : peaks) {
            int left = x;
            int right = x;
            int cnt = 1;
            while(left - 1 >= 0 && nums[left - 1] < nums[left]){
                left--;
                cnt++;
            }

            while(right + 1 < nums.length && nums[right] > nums[right + 1]){
                right++;
                cnt++;
            }

            answer = Math.max(cnt, answer);


        }


        return answer;
    }

    public static void main(String[] args){
        LongestBitonic T = new LongestBitonic();
        System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
        System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}
