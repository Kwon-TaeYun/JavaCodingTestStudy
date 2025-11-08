package week28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommonArray {
    public static int[] solution(int[] arr, int[] arr2, int n, int m){
        Arrays.sort(arr); //1 2 3 5 9
        Arrays.sort(arr2);//2 3 5 7 8
        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1 < n && p2 < m){
            if(arr[p1] < arr2[p2]){
                p1++;
            }else if(arr[p1] > arr2[p2]){
                p2++;
            }else{
                answer.add(arr[p1]);
                p1++;
                p2++;
            }
        }



        return answer.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        int[] solution = solution(arr, arr2, n, m);
        for(int i = 0; i < solution.length; i++){
            System.out.print(solution[i] + " ");
        }

    }
}
