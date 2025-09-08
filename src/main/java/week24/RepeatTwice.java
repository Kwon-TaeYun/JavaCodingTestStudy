package week24;


public class RepeatTwice {
    public static int[] solution(String s) {
        int countZero = 0;
        int countTransform = 0;
        while(!s.equals("1")){
            int originalLength = s.length();
            s = s.replace("0","");
            countZero += originalLength - s.length();
            s = Integer.toBinaryString(s.length());
            countTransform ++;
        }
        return new int[]{countTransform, countZero};
    }

    public static void main(String[] args) {
        System.out.println(solution("110010101001"));
    }
}
