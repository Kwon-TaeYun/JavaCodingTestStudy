package week30;

import java.util.Arrays;

public class MeetingRoom {
    public int[] solution(int[] enter, int[] exit){
        int n = enter.length;
        int[] answer = new int[n];
        for(int i = 0; i < enter.length; i++){
            enter[i]--;
            exit[i]--;
        }

        System.out.println("enter ::: " + Arrays.toString(enter));
        System.out.println("exit ::: " + Arrays.toString(exit));

        int[] enterIdx = new int[n];
        int[] enterT = new int[n];
        int[] exitT = new int[n];

        for(int i = 0; i < n; i++){
            enterIdx[enter[i]] = i;
        }

        int j = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            while(j < n && j <= enterIdx[exit[i]]){
                enterT[j] = cnt;
                cnt++;
                j++;
            }//enter
            exitT[i] = cnt;
            cnt++;
        }//exit

        for(int i = 0; i <n; i++){
            for(int k = i + 1; k < n; k++){
                if(!(exitT[i]< enterT[k] || exitT[k] < enterT[i])){
                  answer[i]++;
                  answer[k]++;
                }
            }
        }

        System.out.println("enterIdx ::: " + Arrays.toString(enterIdx));






        return answer;
    }

    public static void main(String[] args){
        MeetingRoom T = new MeetingRoom();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 5, 3, 4}, new int[]{2, 3, 1, 4, 5})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 3, 2, 4, 5, 7, 6, 8}, new int[]{2, 3, 5, 6, 1, 4, 8, 7})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 7, 2, 3, 5, 6}, new int[]{5, 2, 6, 1, 7, 3, 4})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 2, 3}, new int[]{2, 1, 4, 3})));
    }
}
