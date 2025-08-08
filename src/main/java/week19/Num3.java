package week19;

public class Num3 {
    public static int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n, 3); //3진법으로 변환
        String reverseS = "";
        String[] token = s.split("");
        for(int i = token.length - 1; i >= 0; i--){
            reverseS += token[i];
        }
        answer = Integer.parseInt(reverseS, 3); //3->10진수로 변환
        return answer;
    }

    public static void main(String[] args) {
        int n = 45;
        int solution = solution(n);
        System.out.println(solution);
    }
}
