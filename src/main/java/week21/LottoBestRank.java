package week21;

import java.util.Arrays;

public class LottoBestRank {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int countZero = 0;
        int count = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                countZero++;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                }
            }
        }

        answer[0] = 7-count-countZero;
        answer[1] = 7-count;
        if(answer[1] > 6){
            answer[1] = 6;
        }
        if(answer[0] > 6){
            answer[0] = 6;
        }

//        System.out.println(countZero);
//        System.out.println(count);
        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }
}
