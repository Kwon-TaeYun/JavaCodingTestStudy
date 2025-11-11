package week29;

import java.util.Scanner;

public class IsFriend {
    static int[] unf;
    public static int find(int v){
        if(unf[v] == v) return unf[v];
        else{
            return unf[v] = find(unf[v]);
        }
    }

    public static void union(int a, int b){
       int fa = find(a);
       int fb = find(b);
       if(fa != fb){
           unf[fa] = fb;
       }
    }

    public static String solution(int n, int m, int[][] arr, int f1, int f2){
        unf = new int[n+1];
        for(int i = 1; i <= n; i++){
            unf[i] = i;
        }

        for(int i = 1; i <= m; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            union(a, b);
        }

        if(find(f1) == find(f2)){
            return "YES";
        }

        return "NO";
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m+1][2];
        for(int i = 1; i <= m; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int f1 = in.nextInt();
        int f2 = in.nextInt();
        System.out.println(solution(n, m, arr, f1, f2));
    }
}
