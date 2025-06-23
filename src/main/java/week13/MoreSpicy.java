package week13;
import java.util.PriorityQueue;
import java.util.Queue;

public class MoreSpicy {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.add(s);
        }

        int count = 0;
        while(queue.size() > 1 && queue.peek() < K){
            Integer i1 = queue.remove();
            Integer i2 = queue.remove();
            Integer mixed = i1 + i2 * 2;
            queue.add(mixed);
            count++;
        } //queue 안이 남아있거나 queue에서 마지막 요소가 K 아래일때..

        return queue.peek() >= K ? count : -1;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int solution = solution(scoville, k);
        System.out.println("solution::: " + solution);
    }
}
