package week20;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class TVProgram {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> rank = new PriorityQueue<>(); //우선순위 큐로..
        for(int i = 0; i < score.length; i++){
            rank.add(score[i]);
            if(rank.size() > k){
                rank.poll();
            }

            answer[i] = rank.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] solution = solution(k, score);
        System.out.println(Arrays.toString(solution));
    }
}
