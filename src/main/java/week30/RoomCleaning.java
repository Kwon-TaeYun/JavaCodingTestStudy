package week30;

import java.util.Arrays;

public class RoomCleaning {
    public int[] solution(int[][] board, int k){
        int[] answer = new int[2];
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int x = 0;
        int y = 0;
        int cnt = 0;
        int d = 0;
        while(cnt < k){
            cnt++;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx < 0 || nx >= board.length || ny < 0 || ny >= board.length || board[nx][ny] == 1){
                d = (d + 1) % 4;
                continue;
            }

            x = nx;
            y = ny;
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }

    public static void main(String[] args){
        RoomCleaning T = new RoomCleaning();
        int[][] arr1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr1, 10)));
        int[][] arr2 = {{0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr2, 20)));
        int[][] arr3 = {{0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr3, 25)));

    }

}
