package week24;

public class NextBiggerNum {
    public static int solution(int n) {
        int num = n + 1;
        while (true) {
            if (Integer.bitCount(n) == Integer.bitCount(num)) {
                return num;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        int n = 78;
        int solution = solution(n);
        System.out.println(solution);
    }
}
