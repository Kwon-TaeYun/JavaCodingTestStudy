package week24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tuple {
    public static int[] solution(String s) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        s = s.substring(2, s.length() - 2);
        String[] sets = s.split("\\},\\{");
        Arrays.sort(sets, Comparator.comparingInt(String::length));
        for (String set : sets) {
            String[] token = set.split(",");
            for (String t : token) {
                int n = Integer.parseInt(t);
                if(!result.contains(n)){
                    result.add(n);
                }
            }
        }
//        System.out.println(Arrays.toString(result.toArray()));
        return result.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
    }
}
