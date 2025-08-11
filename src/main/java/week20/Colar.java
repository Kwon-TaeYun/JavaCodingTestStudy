package week20;

public class Colar {
    public static int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int newBottle = (n / a) * b;
            n = (n % a) + newBottle;
            answer += newBottle;
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(2, 1, 20);
        System.out.println(solution);

    }
}
