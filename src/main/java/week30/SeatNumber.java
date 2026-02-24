package week30;

import java.util.Arrays;

public class SeatNumber {
    public int[] solution(int c, int r, int k){
        int[] answer = new int[2];
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int[][] seats = new int[c][r];
        int x = 0;
        int y = 0;
        int d = 0;
        int cnt = 1;
        seats[x][y] = 1;
        while(cnt < k){
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx < 0 || nx >= c || ny < 0 || ny >= r || seats[nx][ny] == 1) {
                d = (d + 1) % 4;
                continue;
            }
            x = nx;
            y = ny;
            cnt++;
            seats[x][y] = 1;
        }


        return new int[]{x+1, y+1};
    }

    public static void main(String[] args){
        SeatNumber T = new SeatNumber();
        System.out.println(Arrays.toString(T.solution(6, 5, 12)));
        System.out.println(Arrays.toString(T.solution(6, 5, 20)));
        System.out.println(Arrays.toString(T.solution(6, 5, 30)));
        System.out.println(Arrays.toString(T.solution(6, 5, 31)));
    }

}
