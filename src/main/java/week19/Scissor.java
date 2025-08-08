package week19;

public class Scissor {
    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(ch == ' '){
                answer.append(' ');
            }else if(ch >= 'A' && ch <= 'Z'){
                char sh = (char)('A' + (ch - 'A' + n) % 26);
                answer.append(sh);
            }else if(ch >= 'a' && ch <= 'z'){
                char sh = (char)('a' + (ch - 'a' + n) % 26);
                answer.append(sh);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        System.out.println(solution(s, n));
    }
}
