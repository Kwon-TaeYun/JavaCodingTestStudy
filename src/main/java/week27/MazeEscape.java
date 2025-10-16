package week27;

import java.util.LinkedList;
import java.util.Queue;

public class MazeEscape {
    static int m, n;
    // 상, 하, 좌, 우 순서로 변경
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static int solution(int[][] maze) {
        m = maze.length;
        n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1}); // x, y, 거리
        visited[0][0] = true;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if(x == m - 1 && y == n - 1) return dist; // 목표 도착 시 바로 반환

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if(!visited[nx][ny] && maze[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny, dist + 1});
                    }
                }
            }
        }

        return -1; // 도달 불가
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };
        System.out.println(solution(maze));
    }
}
