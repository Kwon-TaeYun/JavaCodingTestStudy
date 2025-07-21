package week17;

import java.util.Arrays;

public class OngAri {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] word = { "aya", "ye", "woo", "ma"};
        for (String babble : babbling) {
            for (String w : word) {
                if(babble.contains(w)){
                    babble = babble.replace(w, "");
                }
            }

            if(babble.isEmpty()){
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(babbling));
    }
}
