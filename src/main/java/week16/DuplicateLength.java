package week16;

import java.util.Arrays;
import java.util.Comparator;

public class DuplicateLength {
    public static int solution(int[][] lines) {
        Arrays.sort(lines,Comparator.comparingInt(a -> a[0]));
        int minZone = 100 + lines[0][0];
        int[] zone = new int[201]; //-100 ~ 100

        for(int i = 0; i < lines.length; i++){
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++){
                zone[j] += 1;
            }
        }

        int answer = 0;
        int idx = 0;

        while (idx < zone.length) {
            // 2 이상인 구간 시작
            if (zone[idx] >= 2) {
                // 이 덩어리 길이 세기
                while (idx < zone.length && zone[idx] >= 2) {
                    answer++;
                    idx++;
                }
            } else {
                idx++;
            }
        }

//        System.out.println(Arrays.toString(zone));
        return answer;

    }

    public static void main(String[] args) {
        int[][] lines = {{0, 1},{2, 5},{3, 9}};
        int answer = solution(lines);
        System.out.println(answer);
    }
}
