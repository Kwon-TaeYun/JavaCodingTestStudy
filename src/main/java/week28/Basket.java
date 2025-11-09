package week28;

import java.util.*;

public class Basket {
    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for(int i = 0; i < board.length; i++){
                if(board[i][move - 1] != 0){
                    int doll = board[i][move - 1];
                    board[i][move - 1] = 0;
                    if(!stack.isEmpty() && stack.peek() == doll){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(doll);
                    }
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 보드 크기 입력 (5)
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        // 보드 값 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        // moves 길이 입력
        int m = sc.nextInt();
        int[] moves = new int[m];

        // moves 값 입력
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        // 결과 출력
        System.out.println(solution(board, moves));
    }
}
