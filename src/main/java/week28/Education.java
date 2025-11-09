package week28;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Education {
    public static String solution(String curri, String clas){
        Queue<Character> queue = new ArrayDeque<>();
        for (char c : curri.toCharArray()) {
            queue.offer(c);
        }

        for (char c : clas.toCharArray()) {
            if(!queue.isEmpty() && queue.peek() == c){
                queue.poll();
            }
        }

        if(!queue.isEmpty()){
            return "NO";
        }

        return "YES";
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
    }
}
