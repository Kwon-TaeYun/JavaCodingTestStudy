package week17;

import java.util.Arrays;
import java.util.List;

public class RemoveSmallValue {
    public static int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
        }

        int[] answer = new int[arr.length - 1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[answer.length - i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
