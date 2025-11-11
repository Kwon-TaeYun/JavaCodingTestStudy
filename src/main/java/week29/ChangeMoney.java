package week29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChangeMoney {
    static int n;
    static int m;
    static Integer[] arr;
    static int min = 13;

    public static void dfs(int total, int cnt, Integer[] arr){
        if(total > m) return;
        if(cnt >= min) return;
        if(total == m) {
            min = Math.min(min, cnt);
        }else {
            for (int money : arr) {
                dfs(total + money, cnt + 1, arr);
            }
        }
    }

    public static int solution(int n, int m, Integer[] arr){
        dfs(0, 0, arr);
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        // solution 호출
        System.out.println(solution(n, m, arr));
    }
}
