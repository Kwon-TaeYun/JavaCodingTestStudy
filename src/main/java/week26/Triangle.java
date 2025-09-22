package week26;

public class Triangle {
    public static int solution(int[][] triangle) {
        int answer = 0;
        int n = triangle.length;
        int[][] dp = new int[n][];
        for(int i = 0; i < n; i++){
            dp[i] = new int[triangle[i].length];
        }
        for(int j = 0; j < triangle[n-1].length; j++){
            dp[n-1][j] = triangle[n-1][j];
        }

        for(int i = n-2; i >= 0; i--){
            for(int j = 0; j < triangle[i].length; j++){
                dp[i][j] = triangle[i][j] + Math.max(dp[i+1][j+1], dp[i+1][j]);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] triangle = {
                {7},
                {3,8},
                {8,1,0},
                {2,7,4,4},
                {4,5,2,6,5}
        };
        System.out.println(solution(triangle));
    }
}
