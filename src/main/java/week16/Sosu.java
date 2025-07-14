package week16;

public class Sosu {
    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        while (b % 2 == 0) {
            b /= 2;
        }

        while (b % 5 == 0) {
            b /= 5;
        }

        if (b == 1) {
            return 1; // 유한소수
        } else {
            return 2; // 무한소수
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
