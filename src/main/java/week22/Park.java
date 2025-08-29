package week22;

import java.util.Arrays;

public class Park {
    public static int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                  y = i;
                  x = j;
                }
            }
        }

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] dirs = {'N', 'S', 'W', 'E'};

        for (String route : routes) {
            String[] token = route.split(" ");
            char dir = token[0].charAt(0);
            int dist = Integer.parseInt(token[1]);

            int nowIndex = 0;
            for(int i = 0; i < dirs.length; i++){
                if(dirs[i] == dir){
                    nowIndex = i;
                    break;
                }
            }

            int nx = x;
            int ny = y;
            boolean canMove = true;

            for(int step = 0; step < dist; step++){
                nx += dx[nowIndex];
                ny += dy[nowIndex];

                if(nx < 0 || nx >= park[0].length() || ny < 0 || ny >= park.length){
                    canMove = false;
                    break;
                }
                if(park[ny].charAt(nx) == 'X'){
                    canMove = false;
                    break;
                }
            }

            if(canMove){
                x = nx;
                y = ny;
            }

        }
        return new int[]{y,x};
    }

    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        int[] solution = solution(park, routes);
        System.out.println(Arrays.toString(solution));
    }
}
