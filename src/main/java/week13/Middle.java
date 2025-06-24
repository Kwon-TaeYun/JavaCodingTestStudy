package week13;

import java.util.Arrays;

public class Middle {
    public static int solution(int[] array) {
        Arrays.sort(array);
        if(array.length % 2 != 0){
            return array[array.length/2];
        } else{
            return (array[array.length/2] + array[array.length/2 + 1])/2;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        int solution = solution(array);
        System.out.println(solution);
    }
}
