package week27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DanjiDFS {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int n, m;
    static boolean[][] visited;
    public static int[] solution(int[][] map) {
       n = map.length;
       m = map[0].length;
       List<Integer> danji = new ArrayList<>();
       visited = new boolean[n][m];
       for(int i = 0; i < n; i++){
           for(int j = 0; j < m; j++){
               if(!visited[i][j] && map[i][j] == 1){
                   int count = dfs(map, i, j);
                   danji.add(count);
               }
           }
       }

       Collections.sort(danji);
       int[] answer = new int[danji.size() + 1];
       answer[0] = danji.size();
       for(int i = 1; i <= danji.size(); i++) answer[i] = danji.get(i-1);
       return answer;
    }

    public static int dfs(int[][] map, int x, int y){
        visited[x][y] = true;
        int cnt = 1;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && map[nx][ny] == 1){
                cnt += dfs(map, nx, ny);
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[][] map = {
                {0,1,1,0,1,0,0},
                {0,1,1,0,1,0,1},
                {1,1,1,0,1,0,1},
                {0,0,0,0,1,1,1},
                {0,1,0,0,0,0,0},
                {0,1,1,1,1,1,0},
                {0,1,1,1,0,0,0}
        };
        System.out.println(Arrays.toString(solution(map)));
    }
}
