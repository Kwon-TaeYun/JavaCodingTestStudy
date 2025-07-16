package week16;

import java.util.Arrays;

public class Rank {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        for(int i = 0; i < score.length; i++){
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        for(int i = 0; i < score.length; i++){
            int rank = 1;
            for(int j = 0; j < score.length; j++){
                if(avg[i] < avg[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] score = {{80,70}, {90,50}, {40,70}, {50,80}}; //75, 70, 55, 65
        System.out.println(Arrays.toString(solution(score)));
    }
}
