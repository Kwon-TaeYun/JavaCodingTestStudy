package week28;

public class DuplicateWords {
    public static String solution(String sentence) {
        String answer = "";
        for (char s : sentence.toCharArray()) {
            if(answer.indexOf(s) == -1){
                answer += s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("ksekkset"));
    }
}
