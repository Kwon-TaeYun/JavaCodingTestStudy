package week22;

import static java.lang.Math.*;

public class TouchKeyPad {
    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] keypad = {
                {3,1}, // 0 위치
                {0,0}, {0,1}, {0,2}, // 1,2,3
                {1,0}, {1,1}, {1,2}, // 4,5,6
                {2,0}, {2,1}, {2,2}, // 7,8,9
                {3,0}, {3,2}          // *,# (왼손*, 오른손#)
        };
        int leftPos = 10;
        int rightPos = 11;
        for (int num : numbers) {
            if(num == 1 || num == 4 || num == 7){
                answer.append("L");
                leftPos = num;
            }else if(num == 3 || num == 6 || num == 9){
                answer.append("R");
                rightPos = num;
            }else{
                int target = (num == 0) ? 0 : num;
                int rDis = abs(keypad[target][0] - keypad[rightPos][0]) + abs(keypad[target][1] - keypad[rightPos][1]);
                int lDis = abs(keypad[target][0] - keypad[leftPos][0]) + abs(keypad[target][1] - keypad[leftPos][1]);
                if(lDis == rDis){
                    if(hand.equals("right")) {
                        answer.append("R");
                        rightPos = target;  // 위치 갱신
                    } else {
                        answer.append("L");
                        leftPos = target;   // 위치 갱신
                    }
                } else {
                    if(lDis < rDis){
                        answer.append("L");
                        leftPos = target;
                    } else {
                        answer.append("R");
                        rightPos = target;
                    }
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String solution = solution(numbers, "right");
        System.out.println(solution);
    }
}
