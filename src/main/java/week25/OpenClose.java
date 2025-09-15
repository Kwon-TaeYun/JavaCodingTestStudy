package week25;

public class OpenClose {
    public static String solution(String p) {
        String answer = "";
        if(p.isEmpty()) return "";
        //1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        String[] uv = splitBalanced(p);
        String u = uv[0];
        String v = uv[1];
        //2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다.
        //단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.

        if(isCorrect(u)){
            return u + solution(v);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(solution(v));
        sb.append(")");
        for(int i = 1; i < u.length() - 1; i++){
            sb.append((u.charAt(i) == ')') ? '(' : ')');
        }

        //3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.


        return sb.toString();
    }

    public static String[] splitBalanced(String p){
        int open = 0; int close = 0;
        for(int i = 0; i < p.length(); i++){
            if(p.charAt(i) == '('){
                open++;
            }else{
                close++;
            }
            if(open == close){
                return new String[]{p.substring(0,i+1), p.substring(i+1)};
            }

        }
        return new String[]{p, ""};
    }

    public static boolean isCorrect(String s){
        int balance = 0;
        for (char c : s.toCharArray()) {
            if(c == '('){
                balance++;
            }else{
                balance--;
            }
            if(balance < 0) return false; // )가 먼저 나온 경우
        }

        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("(()())()"));
    }
}
