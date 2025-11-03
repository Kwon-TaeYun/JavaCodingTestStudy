package week28;

public class FindLongestWord {
    public static String solution(String sentence) {
        String answer = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if(word.length() > answer.length()){
                answer = word;
            }
        }

        //s.indexOf(" "): 빈칸의 인덱스 번호 위치 없으면 -1
        //s.substring(a, b): a부터 b개의 단어...

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("it is time to study"));
    }
}
