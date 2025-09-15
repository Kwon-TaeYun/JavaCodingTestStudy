package week24;

public class PrimeNumber {
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        String[] token = s.split("0");
        for(int i = 0 ; i < token.length; i++){
            if(token[i].equals("")){
                continue;
            }
            if(isPrime(Long.parseLong(token[i]))){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(437674, 3));
    }
}
