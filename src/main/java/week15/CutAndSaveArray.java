package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutAndSaveArray {
    public static String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_str.length(); i+=n){
            int end = Math.min(i+n, my_str.length());
            list.add(my_str.substring(i, end));
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(Arrays.toString(solution(my_str, n)));
    }
}
