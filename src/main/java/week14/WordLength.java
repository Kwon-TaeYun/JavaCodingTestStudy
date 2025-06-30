package week14;

import java.util.Arrays;

public class WordLength {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        int[] solution = solution(strlist);
        System.out.println(Arrays.toString(solution));
    }
}
