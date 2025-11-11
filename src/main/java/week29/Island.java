package week29;

import java.util.Scanner;

public class Island {
    static int n;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static int answer = 0;
    public static void dfs(int x, int y, int[][] board){
        for(int i = 0; i < dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1){
                board[nx][ny] = 0;
                dfs(nx, ny, board);

            }
        }
    }
    public static int solution(int[][] board){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    answer++;
                    board[i][j] = 0;
                    dfs(i, j, board);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(arr));
    }
}
