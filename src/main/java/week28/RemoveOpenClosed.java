package week28;

import java.util.Scanner;
import java.util.Stack;

public class RemoveOpenClosed {
    public static String solution(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c :s.toCharArray()){
            if(c == '(' || Character.isAlphabetic(c)) stack.push(c);
            else{
                while(stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }
        }

        for (Character c : stack) {
            sb.append(c);
        }//stack.get(i);

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }
}
