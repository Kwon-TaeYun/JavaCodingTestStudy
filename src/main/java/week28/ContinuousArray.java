package week28;

import java.util.Scanner;

public class ContinuousArray {
    public static int solution(int n, int m, int[] arr){
        int sum = arr[0];
        int result = 0;
        int p1 = 0;
        int p2 = 0;

       while(p1 < n && p2 < n){
           if(sum == m) {
               result++;
               sum -= arr[p1];
               p1++;
           }else if(sum < m){
               if(p2 < n - 1) {
                   p2++;
                   sum += arr[p2];
               }else{
                   break;
               }
           }else{
               sum -= arr[p1];
               p1++;
           }
       }

        return result;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}
