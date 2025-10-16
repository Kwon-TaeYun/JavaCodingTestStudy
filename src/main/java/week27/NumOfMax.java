package week27;

import java.util.Arrays;

public class NumOfMax {
    public static int solution(int[] numbers, int M) {
        Arrays.sort(numbers);
        int maxSum = 0;
        int n = numbers.length;
        for(int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = numbers[left] + numbers[i] + numbers[right];
                if(sum <= M){
                    maxSum = Math.max(sum, maxSum);
                    left++;
                }else{
                    right--;
                }
            }
        }


        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{93, 181, 245, 214, 315, 36, 185, 138, 216, 295}, 500));
    }
}
