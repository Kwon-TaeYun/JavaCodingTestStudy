package week09.하노이탑;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//종료 조건 n == 1 출력
//일반화 조건 집어넣기..
public class HanoiTop {
    public static int[][] solution(int n) {
        List<int[]> answer = new ArrayList<>();
        move(n, 1, 2, 3, answer);
        return answer.toArray(new int[answer.size()][]);
    }

    public static void move(int n, int from, int temp, int to, List<int
            []> answer){
        if(n == 1){
            answer.add(new int[]{from, to});
            return;
        }
        move(n-1, from, to, temp, answer);
        answer.add(new int[]{from, to});
        move(n-1, temp, from, to, answer);
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] answer = solution(n);
        System.out.println(Arrays.deepToString(answer));
    }


}
