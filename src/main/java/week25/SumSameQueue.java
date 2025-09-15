package week25;

import java.util.Arrays;

public class SumSameQueue {
    public static int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = Arrays.stream(queue1).asLongStream().sum();
        long sum2 = Arrays.stream(queue2).asLongStream().sum();
        long total = sum1 + sum2;
        if(total % 2 != 0){
            return -1;
        }
        long target = total / 2;

        //3s 2 7 2 4e 6 5 1
        int n = queue1.length;
        long[] arr = new long[n*2];
        long cur = sum1;

        for(int i = 0; i < n; i++){
            arr[i] = queue1[i];
            arr[i + n] = queue2[i];
        }

        int start = 0, end = n;
        while(start < 2 * n && end < 2 * n){
            if(cur == target) return answer;
            if(cur < target){
                cur += arr[end++];
            }else if(cur > target){
                cur -= arr[start++];
            }

            answer++;
            if(answer > 4 * n) return -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] queue1 = {1,1}; //14
        int[] queue2 = {1,5}; //16


        System.out.println(solution(queue1, queue2));
    }
}
