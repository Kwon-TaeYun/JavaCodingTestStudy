package week28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCow {
    public static int BFS(int S, int E){
        int answer= 0;
        int[] dx = {-1, 1, 5};
        boolean[] visited = new boolean[10001];
        int level = 0;
        Queue<Integer> queue = new LinkedList<>();

        //현재 상황
        visited[S] = true;
        queue.offer(S);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Integer cur = queue.poll();
                if(cur == E){
                    return level;
                }
                for(int x = 0; x < dx.length; x++){
                    int move = cur + dx[x];
                    if(visited[move] == false && move >= 1 && move < 10001) {
                        visited[move] = true;
                        queue.offer(move);
                    }
                }
            }
            level++;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        System.out.println(BFS(input1, input2));
    }
}
