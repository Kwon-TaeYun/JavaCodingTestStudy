package week16;

import java.util.Arrays;

public class UniqueArray {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = {};
        Integer[] nums = Arrays.stream(numlist).boxed().toArray(Integer[]::new); // int[] => Integer[]
        Arrays.sort(nums, (a, b) -> {
            int distA = (int)Math.abs((long)a - n);
            int distB = (int)Math.abs((long)b - n);
            if (distA == distB) {
                return b - a; // 더 큰 수를 먼저
            } else {
                return distA - distB; // 가까운 수를 먼저
            }
        });
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;
        System.out.println(Arrays.toString(solution(numlist, n)));
    }
}
