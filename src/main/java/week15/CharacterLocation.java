package week15;

import java.util.Arrays;

public class CharacterLocation {
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int limitX = board[0] / 2;
        int limitY = board[1] / 2;
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left") && answer[0] - 1 >= -limitX){
                answer[0] -= 1;
            }else if(keyinput[i].equals("right") && answer[0] + 1 <= limitX){
                answer[0] += 1;
            }else if(keyinput[i].equals("up") && answer[1] + 1 <= limitY){
                answer[1] += 1;
            }else if(keyinput[i].equals("down") && answer[1] - 1 >= -limitY){
                answer[1] -= 1;
            }else{
                continue;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11,11};
        System.out.println(Arrays.toString(solution(keyinput, board)));

    }
}
