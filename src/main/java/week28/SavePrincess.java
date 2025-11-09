package week28;
import java.util.*;
public class SavePrincess {
    public static int solution(int m, int n){
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i <= m; i++){
            queue.offer(i);
        }
        int cnt = 0;
        while(queue.size() > 1){
            cnt++;
            if(cnt == n) {
                queue.poll();
                cnt = 0;
            }
            else {
                Integer poll = queue.poll();
                queue.offer(poll);
            }
        }

        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(solution(m, n));
    }
}
