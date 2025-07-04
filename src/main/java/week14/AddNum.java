package week14;

public class AddNum {
    public static int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            answer += s.charAt(i) - '0';
//            System.out.println(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(solution(n));
    }
}
