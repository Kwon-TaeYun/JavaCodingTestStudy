package week12;

import java.util.LinkedList;
import java.util.Queue;

public class PickItems {
    static final int SIZE = 150;
    static int[][] map = new int[SIZE][SIZE];
    static boolean[][] isVisited = new boolean[SIZE][SIZE];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;

        //사각형 그리기
        drawRectangles(rectangle);

        //테두리 그리기
        drawLines(rectangle);

        //테두리 제외 내부 지우기
        eraseLines();

        //최단 거리 구하기
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{characterX, characterY, 0});
        isVisited[characterX][characterY] = true;

        while(!queue.isEmpty()){
            int[] current = queue.remove();
            if(current[0] == itemX && current[1] == itemY){
                return current[2];
            }

            for(int i = 0; i < dx.length; i++){
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                if(nx >= 0 && ny >= 0 && nx < SIZE && ny < SIZE){
                    if(!isVisited[nx][ny] && map[nx][ny] == 2){
                        queue.add(new int[]{nx, ny, current[2] + 1});
                    }
                }
            }

        }

        return 0;
    }

    private static void eraseLines() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (map[x][y] == 2 && hasInside(x, y)) {
                    map[x][y] = 0; // 테두리 아님
                }
            }
        }
    }

    private static void drawLines(int[][] rectangle) {
        for (int[] rect : rectangle) {
            int x1 = rect[0];
            int y1 = rect[1];
            int x2 = rect[2];
            int y2 = rect[3];

            for(int x = x1; x <= x2; x++){
                map[x][y1] = 2;
                map[x][y2] = 2;
            }

            for(int y = y1; y <= y2; y++){
                map[x1][y] = 2;
                map[x2][y] = 2;
            }
        }
    }

    private static void drawRectangles(int[][] rectangle) {
        for (int[] rect : rectangle) {
            int x1 = rect[0];
            int y1 = rect[1];
            int x2 = rect[2];
            int y2 = rect[3];

            for(int i = x1; i <= x2; i++){
                for(int j = y1; j <= y2; j++){
                    map[i][j] = 1;
                }
            }
        }
    }

    private static boolean hasInside(int x, int y) {
        return map[x + 1][y] == 1 && map[x - 1][y] == 1 &&
                map[x][y + 1] == 1 && map[x][y - 1] == 1;
    }

    public static void main(String[] args) {
        int[][] rectangle = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
        int charX = 1;
        int charY = 3;
        int itemX = 7;
        int itemY = 8;
        int result = solution(rectangle, charX, charY, itemX, itemY);
        System.out.println("result ::: " + result);
    }
}
