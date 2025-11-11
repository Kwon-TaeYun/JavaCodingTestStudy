package week29;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeShortestPath {
    static class Point{
        int x;
        int y;
        int dist;
        Point(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static int[][] board;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] checked;
    public static int bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0, 0));
        checked[0][0] = 1;
        while(!queue.isEmpty()){
            Point cur = queue.poll();
            if(cur.x == 6 && cur.y == 6) return cur.dist;
            else{
                for(int i = 0; i < dx.length; i++){
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];
                    if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 0 && checked[nx][ny] == 0) {
                        checked[nx][ny] = 1;
                        queue.offer(new Point(nx, ny, cur.dist + 1));
                    }
                }
            }
        }

        return -1;
    }
    public static int solution(int[][] board){
        checked = new int[7][7];
        return bfs(0,0);
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
