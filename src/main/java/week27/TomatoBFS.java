package week27;
import java.util.*;

public class TomatoBFS {
    static int n, m;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static int solution(int[][] box) {
        n = box.length;
        m = box[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(box[i][j] == 1){
                    q.add(new int[]{i, j, 0});
                }
            }
        }

        int days = 0;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int day = cur[2];
            days = Math.max(day, days);
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(box[nx][ny] == 0){
                        box[nx][ny] = 1;
                        q.add(new int[]{nx, ny, day + 1});
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(box[i][j] == 0){
                    return -1;
                }
            }
        }


        return days;
    }

    public static void main(String[] args) {
        int[][] box = {
                {1, -1, 0, 0, 0},
                {0, -1, 0, 1, 0},
                {0, 0, 0, -1, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(solution(box));
    }
}
