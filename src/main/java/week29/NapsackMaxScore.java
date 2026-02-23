package week29;

import java.util.Arrays;
import java.util.Scanner;

public class NapsackMaxScore {
    public static int solution(int n, int m, int[][] scores){
        int[] dy = new int[m+1];
        int answer = 0;
        Arrays.fill(dy, 0);
        for(int i = 0; i < n; i++){
            int score = scores[i][0];
            int time = scores[i][1];

            for(int j = m; j >= time; j--){
                dy[j] = Math.max(dy[j], dy[j - time] + score);
            }
        }

        for (int d : dy) {
            answer = Math.max(d, answer);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] scores = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                scores[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n, m, scores));
    }
}
