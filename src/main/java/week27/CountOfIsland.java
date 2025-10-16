package week27;

public class CountOfIsland {
    static int[][] map;
    static int n, m;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};

    static boolean[][] visited;

    public static int solution(int[][] grid) {
        int count = 0;
        n = grid.length;
        m = grid[0].length;
        map = grid;
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && map[i][j] == 1){
                    dfs(i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i = 0; i < dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                if(!visited[nx][ny] && map[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1,1,0,0,0},
                {1,1,0,0,1},
                {0,0,0,1,1},
                {0,0,0,0,0},
                {1,0,1,0,1}
        };
        System.out.println(solution(grid));
    }
}
