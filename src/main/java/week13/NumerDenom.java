package week13;

import java.util.Arrays;

public class NumerDenom {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int denom = denom1 * denom2;
        int numer = denom2 * numer1 + denom1 * numer2;
        int gcd = gcd(numer, denom);
        return new int[]{numer / gcd, denom / gcd};
    }

    public static int gcd(int a, int b){
        while(b!=0){
            int remain = a % b;
            a = b;
            b = remain;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] solution = solution(1, 2, 3, 4);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
