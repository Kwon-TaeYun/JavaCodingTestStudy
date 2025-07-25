package week17;

public class ReverseArray {
    public static int[] solution(long n) {
        String[] token = String.valueOf(n).split("");
        int[] answer = new int[token.length];
        for(int i = 0; i < token.length; i++){
            answer[i] = Integer.parseInt(token[token.length-1-i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(solution(n));
    }
}
