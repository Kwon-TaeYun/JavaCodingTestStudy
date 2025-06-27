package week13;

public class Factorial {
    public static int solution(int n) {
        int answer = 1;
        int factorial = 1;
        while(true){
            factorial *= answer;

            if(factorial > n){
                return answer - 1;
            }
            answer++;
        }

    }

    public static void main(String[] args) {
        int n = 3628800;
        int solution = solution(n);
        System.out.println(solution);
    }
}
