package week19;

import java.util.Arrays;

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = gcd * (n / gcd) * (m / gcd);
        return new int[]{gcd, lcm};
    }

    public static void main(String[] args) {
        int[] solution = solution(2, 5);
        System.out.println(Arrays.toString(solution));
    }
}
