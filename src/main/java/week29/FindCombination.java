package week29;

import java.util.Scanner;

public class FindCombination {
    static int n;
    static int m;
    static int[] comb;

    public static void dfs(int L, int s){
        if(L == m) {
            for (int x : comb) {
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for(int i = s; i <= n; i++){
                comb[L] = i;
                dfs(L+1, i+1);
            }
        }
    }
    public static void solution(int n, int m){
        comb = new int[m];
        dfs(0, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        solution(n, m);
    }
}
