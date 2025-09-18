package week25;

import java.nio.MappedByteBuffer;
import java.util.Arrays;

public class ArrowContest {
    static int maxDiff = 0;
    static int[] answer;

    public int[] solution(int n, int[] info) {
        maxDiff = 0;
        answer = new int[]{-1};
        dfs(0, n, new int[11], info);
        return answer;
    }

    private void dfs(int index, int arrowsLeft, int[] ryan, int[] apeach){
        if(index == 11){
            if(arrowsLeft > 0) ryan[10] += arrowsLeft;
            int rScore = 0, aScore = 0;
            for(int i = 0; i < 11; i++){
                if(ryan[i] > apeach[i]){
                    rScore += (10 - i);
                }else if(apeach[i] > 0){
                    aScore += (10 - i);
                }
            }
            int diff = rScore - aScore;
            if(diff > 0){
                if(diff > maxDiff) {
                    maxDiff = diff;
                    answer = ryan.clone();
                }else if(diff == maxDiff){
                    // 낮은 점수에 화살 더 많은 쪽 우선
                    for (int i = 10; i >= 0; i--) {
                        if (ryan[i] > answer[i]) {
                            answer = ryan.clone();
                            break;
                        } else if (ryan[i] < answer[i]) {
                            break;
                        }
                    }
                }
            }
            if(arrowsLeft > 0) ryan[10] -= arrowsLeft;
            return;
        }

        dfs(index+1, arrowsLeft, ryan, apeach); //해당 인덱스 화살 x
        if(arrowsLeft > apeach[index]){
            ryan[index] += apeach[index] + 1;
            dfs(index + 1, arrowsLeft - (apeach[index] + 1), ryan, apeach);
            ryan[index] -= apeach[index] + 1; //백트래킹
        }


    }

    public static void main(String[] args) {
        ArrowContest sol = new ArrowContest();
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(sol.solution(5, info)));
    }
}
