package week28;

import java.util.Scanner;

public class StringSlip {
    public static String solution(String sentence) {
        int count = 1;
        String answer = "";
        char[] arr = sentence.toCharArray();
        for(int i = 0; i < sentence.length() - 1; i++){
            if(sentence.charAt(i) == sentence.charAt(i+1)){
                count++;
            }else{
                answer += sentence.charAt(i);
                if(count > 1){
                    answer += String.valueOf(count);
                }
                count = 1;
            }
        }

        answer += sentence.charAt(sentence.length() - 1);
        if(count > 1){
            answer += String.valueOf(count);
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }
}
