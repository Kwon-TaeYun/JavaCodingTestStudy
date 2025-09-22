package week26;

import java.util.*;

public class N {
    public static int solution(int N, int number) {
        int answer = 0;
        if(N == number) return 1;
        List<Set<Integer>> dp = new ArrayList<>();
        for(int i = 0; i <= 8; i++) dp.add(new HashSet<>());
        for(int i = 1; i <= 8; i++){
            int concatNum = Integer.parseInt(String.valueOf(N).repeat(i));
            dp.get(i).add(concatNum); //5, 55

            for(int j = 1; j < i; j++){
                for (Integer a : dp.get(j)) {
                    for (Integer b : dp.get(i - j)) {
                        if(b != 0) dp.get(i).add(a/b);
                        dp.get(i).add(a+b);
                        dp.get(i).add(a-b);
                        dp.get(i).add(a*b);
                    }
                }
            }

            if(dp.get(i).contains(number)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 12));
    }
}
