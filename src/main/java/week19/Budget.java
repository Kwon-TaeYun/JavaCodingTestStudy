package week19;

import java.util.Arrays;

public class Budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int remain = budget;
        int[] dArray = Arrays.stream(d).sorted().toArray();
//        System.out.println(Arrays.toString(dArray));
        for(int i = 0; i < dArray.length; i++){
            if(remain - dArray[i] >= 0){
                answer++;
                remain -= dArray[i];
            }else{
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d= {1,3,2,5,4};
        int budget = 9;
        int solution = solution(d, budget);
        System.out.println(solution);
    }
}
