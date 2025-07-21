package week16;

public class BinarySum {
    public static String solution(String bin1, String bin2) {
        String answer = "";
        int numBin1 = Integer.parseInt(bin1, 2);
        System.out.println(numBin1);
        int numBin2 = Integer.parseInt(bin2, 2);
        int sum = numBin1 + numBin2;

        return String.valueOf(Integer.toBinaryString(sum));
    }
    public static void main(String[] args) {
        System.out.println(solution("10", "11"));
    }
}
