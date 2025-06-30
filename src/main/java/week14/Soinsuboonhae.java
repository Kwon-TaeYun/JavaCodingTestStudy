package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soinsuboonhae {
    public static int[] solution(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                list.add(i);
                while(n % i == 0){
                    n /= i;
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 420;
        int[] solution = solution(n);
        System.out.println(Arrays.toString(solution));
    }
}
