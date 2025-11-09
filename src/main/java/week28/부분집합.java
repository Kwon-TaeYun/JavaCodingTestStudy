package week28;

public class 부분집합 {
    static int N;
    static int[] ch;
    public static void DFS(int L){
        if(L == N+1){
            for(int i = 1; i < ch.length; i++){
                if(ch[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        }else{
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        N = 3;
        ch = new int[N+1];
        DFS(1);

    }
}
