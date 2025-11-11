package week29;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicatePermution {
    static int n;
    static int m;
    static int[] pm;
    public static void dfs(int level){
        if(level == m){
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for(int i = 1; i <= n; i++){
                pm[level] = i;
                dfs(level+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        dfs(0);
    }
}
