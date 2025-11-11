package week29;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IslandBFS {
    static int n;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static int answer = 0;
    static Queue<Point> queue = new LinkedList<>();
    public static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void bfs(int x, int y, int[][] board){
        queue.add(new Point(x, y));
        while(!queue.isEmpty()){
            Point cur = queue.poll();
            for(int i = 0; i < 8; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1){
                    board[nx][ny] = 0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }
    public static int solution(int[][] board){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    answer++;
                    board[i][j] = 0;
                    bfs(i, j, board);
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
