package week29;

import java.util.Scanner;

public class FindMaze {
    static int board[][];
    static boolean checked[][];
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int cnt = 0;
    public static void dfs(int x, int y){
        if(x == 6 && y == 6){
            cnt++;
        }else{
            for(int i = 0; i < dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7){
                    if(!checked[nx][ny] && board[nx][ny] == 0){
                        checked[nx][ny] = true;
                        dfs(nx, ny);
                        checked[nx][ny] = false;
                    }
                }
            }
        }
    }

    public static int solution(int[][] board){
        checked = new boolean[7][7];
        checked[0][0] = true;
        dfs(0,0);
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[7][7];
        // 7×7 입력 받기
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(board));
    }
}
