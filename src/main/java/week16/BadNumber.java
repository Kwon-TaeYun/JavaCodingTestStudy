package week16;

public class BadNumber {
    public static int solution(int n) {
        int count = 0; // n번째
        int num = 0;   // 실제 숫자

        while (count < n) {
            num++;
            if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }
            count++;
        }

        return num;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }
}
