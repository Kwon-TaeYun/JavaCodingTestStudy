package week21;


import java.util.Arrays;

public class FruitSeller {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        int n = score.length;

        Arrays.sort(score); // 1,1,1,2,2,3,3
        for(int i = n; i >= m; i -= m){
            int minValue = score[i-m];
            answer += minValue * m;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        int solution = solution(3, 4, score);
        System.out.println(solution);
    }
}
