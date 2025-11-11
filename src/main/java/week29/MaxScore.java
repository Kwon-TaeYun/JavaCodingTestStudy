package week29;

import java.util.Scanner;

public class MaxScore {
    static int n; //problem
    static int m; //limit time
    static int[][] arr;
    static int max = 0;
    public static void dfs(int total, int level, int limitTime){
        if(level > n){
            if(limitTime < 0){
                return;
            }else{
                max = Math.max(max, total);
            }
        }else{
            dfs(total+arr[level][0], level+1, limitTime - arr[level][1]);
            dfs(total, level+1, limitTime);
        }
    }

    public static int solution(int n, int[][] arr){
        dfs(0, 1, m);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n+1][2];
        for (int i = 1; i <= n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // solution 호출
        System.out.println(solution(n, arr));
    }
}
