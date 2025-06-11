package week11;

import java.util.LinkedList;
import java.util.Queue;

//BFS Lv 2
public class ShortestLength {
    
    public static int solution(int[][] maps) {
        int answer = 0;
        int m = maps.length; //가로 길이
        int n = maps[0].length; //세로 길이
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        Queue<int[]> queue = new LinkedList<>();
        int[][] isVisited = new int[m][n];
        isVisited[0][0] = 2; //방문 했을 때는 2로 표시!
        queue.add(new int[]{0,0,1}); //지나온 길 다 넣기
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int count = now[2];

            if(x == m - 1 && y == n - 1){
                return count;
            }

            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < m && ny >= 0 && ny < n){
                    if(maps[nx][ny] == 1 && isVisited[nx][ny] == 0){
                        isVisited[nx][ny] = 2;
                        queue.add(new int[]{nx, ny, count+1});
                    }
                }
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
        int answer = solution(maps);

        System.out.println("answer:::" + answer);
    }

}


