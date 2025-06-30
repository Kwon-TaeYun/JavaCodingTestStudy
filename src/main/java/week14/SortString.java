package week14;

import java.util.ArrayList;
import java.util.Arrays;

public class SortString {
    public static int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Character t : my_string.toCharArray()) {
            if(Character.isDigit(t)){
                list.add(t - '0');
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        String my_string = "hi12392";
        int[] solution = solution(my_string);
        System.out.println(Arrays.toString(solution));
    }
}
