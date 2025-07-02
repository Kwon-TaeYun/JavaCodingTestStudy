package week14;

import java.util.HashMap;
import java.util.Map;

public class DontLikeEnglish {
    public static long solution(String numbers) {
        Map<String, Integer> map = new HashMap<>();
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        Integer[] num = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < num.length; i++){
            map.put(number[i], num[i]);
        }
        String text = "";
        String answer = "";

        String[] token = numbers.split("");
        for(int i = 0; i < numbers.length(); i++){
            text += numbers.charAt(i);
            if(map.containsKey(text)){
                answer += map.get(text);
                text="";
            }
        }
        return Long.valueOf(answer);
    }

    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        long solution = solution(numbers);
        System.out.println(solution);
    }
}
