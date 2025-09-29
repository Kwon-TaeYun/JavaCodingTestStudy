package week26;

import java.util.Arrays;
import java.util.Stack;

public class FollowingBigNumber {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < numbers.length; i++){
            while(!stack.isEmpty() && numbers[i] > numbers[stack.peek()]){
                int idx = stack.pop();
                answer[idx] = numbers[i];
            }//i = 2
            stack.push(i);
        }//0,1,
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 5};
        System.out.println(Arrays.toString(solution(numbers)));
    }
}
