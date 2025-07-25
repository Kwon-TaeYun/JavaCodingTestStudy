package week17;

public class AddNumber {
    public static int solution(int n) {
        int answer = 0;
        char[] s = String.valueOf(n).toCharArray();
        for(int i = 0; i < s.length; i++){
            answer += Integer.parseInt(String.valueOf(s[i]));
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }
}
