package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NGob {
    public static Integer[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            if(num % n == 0){
                list.add(num);
            }
        }

        return list.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(n, numlist)));
    }
}
