package week18;

public class Colaz {
    public static int solution(int num) {
        int answer = 0;
        long n = num;
        while(n != 1){
            answer++;
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = 3 * n + 1;
            }

            if(answer == 500){
                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int solution = solution(n);
        System.out.println(solution);
    }
}
