package week26;

import java.util.Stack;

public class DeliveryBox {
    public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int n = order.length;
        int idx = 0;
        int box = 1;
        while(idx < n){
            if(!stack.isEmpty() && stack.peek() == order[idx]){
                stack.pop();
                answer++;
                idx++;
            }else if(box <= n){
                if(box != order[idx]){
                    stack.push(box);
                }else{
                    answer++;
                    idx++;
                }
                box++;
            }else{
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] order = {4,3,1,2,5};
        System.out.println(solution(order));
    }
}
