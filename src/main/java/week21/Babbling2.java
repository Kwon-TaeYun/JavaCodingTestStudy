package week21;

import java.util.Arrays;

public class Babbling2 {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] babb = {"aya", "ye", "woo", "ma"};
//        for(int i = 0; i < babbling.length; i++){
//            for(int j = 0; j < babb.length; j++){
//                if(babbling[i].contains(babb[j] + babb[j])){
//                    continue;
//                }
//                if(babbling[i].contains(babb[j])){
//                    babbling[i] = babbling[i].replaceFirst(babb[j], "");
//                }
//            }
//        }
//
//        for(int i = 0; i < babbling.length; i++){
//            if(babbling[i].equals("")) answer += 1;
//        }
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            boolean isValid = true;

            // 1. 같은 발음 연속 금지 체크
            for (String b : babb) {
                if (word.contains(b + b)) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid) continue;

            // 2. 발음을 모두 제거
            for (String b : babb) {
                while (word.contains(b)) {
                    word = word.replaceFirst(b, "");
                }
            }

            // 3. 전부 제거되면 발음 가능
            if (word.equals("")) {
                answer++;
            }
        }
//        System.out.println(Arrays.toString(babbling));
        return answer;
    }

    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling));
    }
}
