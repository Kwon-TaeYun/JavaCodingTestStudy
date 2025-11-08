package week28;

import java.util.Scanner;

public class ContinuousNumber {
    public static int solution(int n){
        int answer = 0;
//        int k = 1;
//        while(k*(k-1)/2 < n){
//            k++;
//        }
//
//        for(int i = 2; i <= k-1; i++){
//            if((n - i*(i-1)/2) % i == 0){
//                answer++;
//            }
//        }

        int cnt = 1;
        n--;
        while(n > 0){
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) answer++;
        }

        return answer;
    }// N = (1~k) kx + k(k-1)/2
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}
