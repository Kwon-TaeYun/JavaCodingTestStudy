package week12;

import java.util.LinkedList;
import java.util.Queue;

public class PickItems {
    static final int SIZE = 102;
    static boolean[][] line = new boolean[SIZE][SIZE];
    static boolean[][] filled = new boolean[SIZE][SIZE];
    static boolean[][] isVisited = new boolean[SIZE][SIZE];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        line = new boolean[SIZE][SIZE];
        filled = new boolean[SIZE][SIZE];
        isVisited = new boolean[SIZE][SIZE];

        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;

            // 내부 채우기
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    filled[i][j] = true;
                }
            }
        }

        // 테두리 따로 저장 (filled 기반으로)
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;

            for (int i = x1; i <= x2; i++) {
                if (filled[i][y1]) line[i][y1] = true;
                if (filled[i][y2]) line[i][y2] = true;
            }
            for (int j = y1; j <= y2; j++) {
                if (filled[x1][j]) line[x1][j] = true;
                if (filled[x2][j]) line[x2][j] = true;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        int startX = characterX * 2;
        int startY = characterY * 2;
        int endX = itemX * 2;
        int endY = itemY * 2;

        queue.add(new int[]{startX, startY, 0});
        isVisited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (x == endX && y == endY) {
                return dist / 2;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < SIZE && ny < SIZE) {
                    if (!isVisited[nx][ny] && line[nx][ny]) {
                        isVisited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, dist + 1});
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] rectangle = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
        int charX = 1;
        int charY = 3;
        int itemX = 7;
        int itemY = 8;
        int result = solution(rectangle, charX, charY, itemX, itemY);
        System.out.println("result ::: " + result);  // ✅ 17
    }
}
