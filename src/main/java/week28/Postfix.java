package week28;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static int solution(String s){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if(Character.isDigit(c)){
                int i = c - '0';
                stack.push(i);
            }else{
                int i1 = stack.pop();
                int i2 = stack.pop();
                if(c == '+'){
                    answer = i2 + i1;
                }else if(c == '-'){
                    answer = i2 - i1;
                }else if(c == '*'){
                    answer = i2 * i1;
                }else{
                    answer = i2 / i1;
                }
                stack.push(answer);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }
}
