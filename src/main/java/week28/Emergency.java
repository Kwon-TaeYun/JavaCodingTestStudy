package week28;

import java.util.*;

public class Emergency {
    public static int solution(int n, int[] moves){
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < moves.length; i++){
            queue.offer(new int[]{i, moves[i]});
        }

        while(!queue.isEmpty()){
            boolean hasHigher = false;
            int[] curr = queue.poll();
            for (int[] patient : queue) {
                if(patient[1] > curr[1]){
                    hasHigher = true;
                    break;
                }
            }

           if(hasHigher){
               queue.offer(curr);
           }else{
               answer++;
               if(curr[0] == n) return answer;
           }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution(n, moves));
    }
}
