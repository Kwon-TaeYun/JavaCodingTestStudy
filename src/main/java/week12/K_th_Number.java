package week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K_th_Number {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            List<Integer> mid = new ArrayList<>();
            for(int j = start; j < end; j++){
                mid.add(array[j]);
            }

            Collections.sort(mid);

            answer[i] = mid.get(k);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        int[] answer = solution(array, commands);
        System.out.println("answer::: " + Arrays.toString(answer));
    }
}
