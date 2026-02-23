package week29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DogRide {
    static int max = 0;
    static int N;
    static int C;
    static int[] arr;

    public static void dfs(int sum, int level){
        if(sum > C) return;

        if(level == N){
            max = Math.max(max, sum);
            return;
        }

        dfs(sum, level + 1);
        dfs(sum + arr[level], level + 1);
    }

    public static int solution(int n, int c, int[] a){
        N = n;
        C = c;
        arr = a;
        dfs(0, 0);
        return max;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int C = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solution(N, C, arr));
    }

}
