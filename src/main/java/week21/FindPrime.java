package week21;

public class FindPrime {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(isPrime(i)) answer++;
        }
        return answer;
    }

    private static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
