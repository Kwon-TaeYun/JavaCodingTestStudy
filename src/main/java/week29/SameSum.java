package week29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SameSum {
    static int[] arr;
    static int n;
    static int total;
    static ArrayList<Integer> sums = new ArrayList<>();
    public static void DFS(int sum, int i){
        if(i == n){
            sums.add(sum);
        }else{
            DFS(sum, i+1);
            DFS(sum+arr[i], i+1);
        }
    }

    public static String solution(int n, int[] arr){
        total = Arrays.stream(arr).sum();
        DFS(0, 1);
        for (Integer sum : sums) {
            if(sum == total - sum) return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // solution 호출
        System.out.println(solution(n, arr));
    }
}
