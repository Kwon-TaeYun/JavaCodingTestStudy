package week26;

public class School {
    public static int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[m][n];
        boolean[][] isPuddle = new boolean[m][n];
        for (int[] puddle : puddles) {
            int x = puddle[0] - 1;
            int y = puddle[1] - 1;
            isPuddle[x][y] = true;
        }
        dp[0][0] = 1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(isPuddle[i][j]) dp[i][j] = 0;
                else{
                    if(i > 0) dp[i][j] = (dp[i][j] + dp[i-1][j]) % 1000000007;
                    if(j > 0) dp[i][j] = (dp[i][j] + dp[i][j-1]) % 1000000007;
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 3, new int[][]{{2,2}}));
    }
}
