package week23;

import java.util.Arrays;

public class Carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        for(int h = 1; h <= Math.sqrt(yellow); h++){
            if(yellow % h == 0){
                int w = yellow / h;
                if((w+2)*(h+2) == (brown + yellow)){
                    return new int[]{w+2, h+2};
                }
            }
        } //(1,2)
        return answer;
    }

    //넓이 w*h = 12
    //yellow: (w-2)(h-2) = 2
    //brown: wh -(wh-2(w+h)+4) = 2((w+h)-2) = 10

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
    }
}
