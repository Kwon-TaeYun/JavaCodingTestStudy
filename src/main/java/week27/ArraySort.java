package week27;

import java.util.Arrays;

public class ArraySort {
    public static String[][] solution(String[] names, int[] scores) {
        int n = names.length;
        String[][] arr = new String[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = names[i];
            arr[i][1] = String.valueOf(scores[i]);
        }

        Arrays.sort(arr, (a, b) -> {
            int scoreA = Integer.parseInt(a[1]);
            int scoreB = Integer.parseInt(b[1]);
            if(scoreA == scoreB){
                return a[0].compareTo(b[0]);
            }
            return scoreB - scoreA;
        });



        return arr;
    }

    public static void main(String[] args) {
        String[] names = {"kim", "lee", "park", "choi"};
        int[] scores = {90, 95, 95, 85};

        String[][] res = solution(names, scores);
        for (String[] r : res) {
            System.out.println(Arrays.toString(r));
        }

    }
}
