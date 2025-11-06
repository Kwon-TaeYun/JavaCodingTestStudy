package week28;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    } //소수 구하는 공식

    public static int solution(int n){
        int answer = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(solution(input1));
    }
}
