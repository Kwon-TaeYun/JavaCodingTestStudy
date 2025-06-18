package week12;

import java.util.Arrays;

public class HIndex {
    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i; // 인용 수 이상인 논문 개수
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int answer = solution(citations);
        System.out.println("answer ::: " + answer);

    }
}
