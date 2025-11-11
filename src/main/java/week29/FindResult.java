package week29;

import java.util.Scanner;

public class FindResult {
    static int[] b, p, ch;
    static int n, f;
    static boolean flag = false;
    static int[][] dy = new int[35][35];

    public static int comb(int n, int r){
        if(n == r || r == 0) return dy[n][r] = 1;
        else return dy[n][r] = comb(n-1, r-1)+comb(n-1, r);
    }
    public static void dfs(int L, int sum){
        if(flag) return;
        if(L == n){
            if(sum==f){
                for (int x : p) {
                    System.out.print(x + " ");
                    flag =true;
                }
            }
        }else{
            for(int i = 1; i <= n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[L] = i;
                    dfs(L+1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        n = input1;
        f = input2;
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            b[i] = comb(n-1, i);
        }

        dfs(0, 0);

    }
}
