package week25;

public class DestroyBuilding {
    public static int solution(int[][] board, int[][] skill) {
        int answer = 0;
        int N = board.length;
        int M = board[0].length;
        int[][] damage = new int[N+1][M+1];
        for (int[] sk : skill) {
            int skillType = sk[0];
            int r1 = sk[1];
            int c1 = sk[2];
            int r2 = sk[3];
            int c2 = sk[4];
            int degree = sk[5];

            int d = (skillType == 1) ? -degree : +degree;
            damage[r1][c1] += d;
            if(c2 + 1 < M) damage[r1][c2 + 1] -= d;
            if(r2 + 1 < N) damage[r2+1][c1] -= d;
            if(c2 + 1 < M && r2 + 1 < N) damage[r2+1][c2+1] += d;
        }

        for(int r = 0; r < N; r++){
            for(int c = 1; c < M; c++){
                damage[r][c] += damage[r][c-1];
            }
        }

        for(int c = 0; c < M; c++){
            for(int r = 1; r < N; r++){
                damage[r][c] += damage[r-1][c];
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (board[r][c] + damage[r][c] > 0) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}};
        int[][] skill = {{1,0,0,3,4,4},{1,2,0,2,3,2},{2,1,0,3,1,2},{1,0,1,3,3,1}};
        System.out.println(solution(board, skill));
    }
}
