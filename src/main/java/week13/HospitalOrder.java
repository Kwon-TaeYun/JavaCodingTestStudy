package week13;

import java.util.*;

public class HospitalOrder {
    public static int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] sorted = Arrays.copyOf(emergency, n);  // 배열 복사
        Arrays.sort(sorted);  // 오름차순 정렬

        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rank.put(sorted[i], n - i);  // 큰 숫자가 1등
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = rank.get(emergency[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        int[] solution = solution(emergency);
        System.out.println(Arrays.toString(solution));
    }
}
