package week28;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args){
        int answer = 0;
        Scanner in= new Scanner(System.in);
        String input1 = in.nextLine();          // 문자열 전체 읽기
        char input2 = in.nextLine().charAt(0);
        input1 = input1.toLowerCase();
        input2 = Character.toLowerCase(input2);
        for (char c : input1.toCharArray()) {
            if(c == input2){
                answer++;
            }
        }
        System.out.println(answer);


    }
}
