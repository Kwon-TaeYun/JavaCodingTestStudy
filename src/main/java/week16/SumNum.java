package week16;

import java.util.Arrays;

public class SumNum {
    public static int[] solution(int num, int total) {
        int start = 0;
        int end = 0;
        System.out.println(total / num);
        if(num % 2 == 0){
            start = total / num - num / 2 + 1; // 3 - 2 + 1 = 2
            end = total / num + num / 2; // 3 + 2 = 5
        }else{
            start = total / num - num / 2; // 3 - 2
            end = total / num + num / 2; //3 + 2
        }
        int[] answer = new int[end - start + 1];

        int index = 0;
        for(int i = start; i <= end; i++){
            answer[index] = i;
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 4;
        int total = 14;
        System.out.println(Arrays.toString(solution(num, total)));
    }
}
