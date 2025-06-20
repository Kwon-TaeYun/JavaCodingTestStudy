package week12;

import java.util.Arrays;

public class BiggestNumber {
    public static String solution(int[] numbers) {
        String answer = "";
        String[] strNumbers = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNumbers, (a,b) ->
            (b+a).compareTo(a+b)
        ); //3개를 동시에 비교

//        System.out.println(Arrays.toString(strNumbers));

        if(strNumbers[0].equals("0")){
            return "0";
        }

        for (String strNumber : strNumbers) {
            answer+=strNumber;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        String answer = solution(numbers);
        System.out.println("answer::: " + answer);

    }
}
