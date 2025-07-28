package week18;

import java.util.Arrays;

public class NoNumberAdd {
    public static long solution(long n) {
        long answer = 0;
        String[] token = String.valueOf(n).split("");
        Arrays.sort(token);
//        System.out.println(Arrays.toString(token));
        StringBuilder sb = new StringBuilder();
        for(int i = token.length - 1; i >= 0; i--){
            sb.append(token[i]);
        }
        return Long.parseLong(String.valueOf(sb));
    }

    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));

    }
}
