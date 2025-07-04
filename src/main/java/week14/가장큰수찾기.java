package week14;

import java.util.Arrays;

public class 가장큰수찾기 {
    public static int[] solution(int[] array) {
        int maxValue = array[0];
        int maxIndex = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return new int[]{maxValue, maxIndex};
    }

    public static void main(String[] args) {
        int[] array = {9, 10, 11, 8};
        int[] solution = solution(array);
        System.out.println(Arrays.toString(solution));
    }
}
