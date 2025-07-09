package week15;

import java.util.Arrays;

public class MakeMaxValue {
    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};
        int solution = solution(numbers);
        System.out.println(solution);
    }
}
