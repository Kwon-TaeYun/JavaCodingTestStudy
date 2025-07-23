package week16;

public class SplitString {
    public static int solution(String A, String B) {
        int answer = 0;
        String rotated = A;
        for(int i = 0; i < A.length(); i++){
            if(rotated.equals(B)){
                return i;
            }
            rotated = rotated.charAt(rotated.length() - 1) + rotated.substring(0, rotated.length() - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";
        System.out.println(solution(A, B));
    }
}
