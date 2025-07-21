package week17;

import java.util.Arrays;

public class AtoB {
    public static int solution(String before, String after) {
        int answer = 0;
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        for(int i = 0; i < before.length(); i++){
            if(!(beforeArray[i] == afterArray[i])){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before, after));
    }
}
