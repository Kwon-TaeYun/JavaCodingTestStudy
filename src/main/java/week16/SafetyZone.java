package week16;

public class SafetyZone {
    public static int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int m = board[0].length;

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 1){
                    board[i][j] = 2;
                    for(int d = 0; d < dx.length; d++){
                        int x = i + dx[d];
                        int y = j + dy[d];
                        if(x >= 0 && x < n && y >= 0 && y < m) {
                            if (board[x][y] == 0) { // 이미 지뢰나 위험지역이면 덮어쓸 필요 없음
                                board[x][y] = 2;
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 2){
                   answer++;
                }
            }
        }


        return n*m - answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 1, 1, 0},{0, 0, 0, 0, 0}};
        System.out.println(solution(board));
    }
}
