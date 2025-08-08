package week19;


public class StrangeWord {
    public static String solution(String s) {
        String answer = "";
        String[] token = s.split(" ");
        for(int i = 0; i < token.length; i++){
            String[] word = token[i].split("");
            for(int j = 0; j < word.length; j++){
                if(j % 2 == 0){
                    answer += word[j].toUpperCase();
                }else{
                    answer += word[j];
                }
            }
            answer += " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
