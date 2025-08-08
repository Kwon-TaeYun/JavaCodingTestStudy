package week19;

import java.util.Arrays;

public class SimilarWord {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        int i = 0;
        StringBuilder sb = new StringBuilder();
        String[] token = s.split("");
        for (String t : token) {
            answer[i] = sb.lastIndexOf(t);
            if(answer[i] != -1){
                answer[i] = i - answer[i];
            }
            i++;
            sb.append(t);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";
        int[] solution = solution(s);
        System.out.println(Arrays.toString(solution));
    }
}
