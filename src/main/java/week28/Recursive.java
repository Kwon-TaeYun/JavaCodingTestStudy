package week28;

public class Recursive {
    public static void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void DFS1(int n){
        if(n == 0) return;
        else {
                DFS1(n / 2);
            System.out.print(n % 2 + " ");

        }
    }

    public static int DFS2(int n){
        if(n == 1) return 1;
        else {
            return n * DFS2(n-1);
        }
    }

    public static int fibo(int n){
        if(n == 1 || n == 2) return 1;
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 11;
        int k = 5;
        int q = 10;
        DFS(n);
        System.out.println();
        DFS1(m);
        System.out.println();
        int answer = DFS2(k);
        System.out.println(answer);
        for(int i = 1; i <= q; i++){
            System.out.print(fibo(i) + " ");
        }
    }
}
