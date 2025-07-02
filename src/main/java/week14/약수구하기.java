package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 약수구하기 {
    public static Integer[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer.add(i);
            }
        }
        return answer.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int n = 24;
        Integer[] solution = solution(n);
        System.out.println(Arrays.toString(solution));
    }
}
