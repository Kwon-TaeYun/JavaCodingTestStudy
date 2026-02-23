package week29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxBlock {
    static class Block {
        int s;
        int h;
        int w;

        public Block(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }
    }

    public static int solution(int n, int[][] arr) {
        ArrayList<Block> blockList = new ArrayList<>();
        int[] dy = new int[n];
        Arrays.sort(arr, (a, b) ->
                b[0] - a[0]
        );

        for (int[] block : arr) {
            blockList.add(new Block(block[0], block[1], block[2]));
        }

        dy[0] = blockList.get(0).h;
        int answer = dy[0];

        for (int i = 1; i < n; i++) {
            int max_h = 0;
            for (int j = 0; j < i; j++) {
                if (blockList.get(j).w > blockList.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + blockList.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
