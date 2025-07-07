package week14;

import java.util.Arrays;

public class OXQuiz {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] token = quiz[i].split(" ");
            System.out.println(Arrays.toString(token));
            if(token[1].equals("+")){
                if(Integer.valueOf(token[0]) + Integer.valueOf(token[2]) == Integer.valueOf(token[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else if(token[1].equals("-")){
                if(Integer.valueOf(token[0]) - Integer.valueOf(token[2]) == Integer.valueOf(token[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(solution(quiz)));
    }
}
