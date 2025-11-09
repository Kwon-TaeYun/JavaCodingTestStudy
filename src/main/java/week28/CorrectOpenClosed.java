package week28;

import java.util.Scanner;
import java.util.Stack;

public class CorrectOpenClosed {
    public static String solution(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.add(c);
            }else{
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            return "NO";
        }else{
            return "YES";
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }
}
