package week24;

import java.util.Arrays;
import java.util.Stack;

public class Friend4Block {
    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];
        int[] dx = {1,1,0};
        int[] dy = {0,1,1};
        for(int i = 0; i < m; i++){
            map[i] = board[i].toCharArray();
        }

        //이제 지워봅시다
        while(true){
            boolean[][] checked = new boolean[m][n];
            for (int i = 0; i < m; i++)
                Arrays.fill(checked[i], false);
            int cnt = 0;
            for(int i = 0; i < m - 1; i++){
                for(int j = 0; j < n - 1; j++){
                    char c = map[i][j];
                    if(c == ' ') continue;
                    if(c == map[i][j+1] && c == map[i+1][j] && c == map[i+1][j+1]){
                        checked[i][j] = checked[i][j+1] = checked[i+1][j] = checked[i+1][j+1] = true;
                    }
                }
            }

            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(checked[i][j]){
                        map[i][j] = ' ';
                        cnt++;
                    }
                }
            }

            if(cnt == 0) break;
            answer += cnt;

            // 3. 중력 처리 (Stack 없이)
            for (int j = 0; j < n; j++) {
                int empty = m - 1; // 채워야 할 위치 (맨 아래)
                for (int i = m - 1; i >= 0; i--) {
                    if (map[i][j] != ' ') {
                        map[empty][j] = map[i][j];
                        if (empty != i) map[i][j] = ' ';
                        empty--;
                    }
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] board = {
                "CCBDE",
                "AAADE",
                "AAABF",
                "CCBBF"
        };
        System.out.println(solution(4,5, board));
    }
}
