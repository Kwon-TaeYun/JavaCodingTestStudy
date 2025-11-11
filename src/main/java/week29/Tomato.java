package week29;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
    static int m;
    static int n;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    public static class Location{
        int x;
        int y;
        int dist;

        Location(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    static int[][] board;
    public static int bfs(){
        Queue<Location> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1){
                    q.offer(new Location(i, j, 0));
                }
            }
        }
        int days = 0;
        while(!q.isEmpty()){
            Location cur = q.poll();
            days = cur.dist;
            for(int i = 0; i < dx.length; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if(nx >= 0 && nx < m && ny >= 0 && ny < n && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    q.offer(new Location(nx, ny, cur.dist + 1));
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }
            }
        }
        return days;

    }
    public static int solution(int[][] board){
        return bfs();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[m][n];
        // 7×7 입력 받기
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(board));
    }
}
