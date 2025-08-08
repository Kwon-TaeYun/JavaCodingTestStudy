package week19;

import java.util.Arrays;

public class MinRectangle {
    public static int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }

        int maxLength = sizes[0][0];
        int maxWidth = sizes[0][1];

        for(int i = 1; i < sizes.length; i++){
            maxLength = Math.max(maxLength, sizes[i][0]);
            maxWidth = Math.max(maxWidth, sizes[i][1]);
        }

        return maxLength * maxWidth;
    }

    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(solution(sizes));
    }
}
