package week28;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Rank {
    public static int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = 1;
        }
        int s = 0;
        while(s < n){
            for(int i = 0; i < n; i++){
                if(arr[i] < arr[s]){
                    answer[i]++;
                }
            }
            s++;
        }


        return answer;
    }//4 3 2 1 5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 첫 줄 입력

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(
                Arrays.stream(solution(n, arr))
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
        );
    }
}
