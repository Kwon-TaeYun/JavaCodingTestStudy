package week29;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static int solution(int n, int[] coins, int m){
        int answer = 0;
        int[] dy = new int[m+1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = coins[i]; j <= m; j++){
                dy[j] = Math.min(dy[j - coins[i]] + 1, dy[j]);
            }
        }

        return dy[m];
    }// 0 1 2 3 4 5
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] coin = new int[n];
        for(int i = 0; i < n; i++){
            coin[i] = in.nextInt();
        }
        int m = in.nextInt();
        System.out.println(solution(n, coin, m));
    }
}
