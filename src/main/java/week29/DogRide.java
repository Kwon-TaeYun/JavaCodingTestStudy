package week29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DogRide {
    static int n;
    static int m;
    static int[] arr;
    static ArrayList<Integer> sums = new ArrayList<>();
    static int max = 0;
    public static void dfs(int level, int sum){
        if(sum > n){
            return;
        }else {
            if (level == m) {
                max = Math.max(sum, max);
            } else {
                dfs(level + 1, sum);
                dfs(level + 1, sum + arr[level + 1]);
            }
        }
    }

    public static int solution(int n, int[] arr){
        dfs(0, 0);
        return max;
    }

}
