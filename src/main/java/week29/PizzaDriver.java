package week29;

import java.util.*;


public class PizzaDriver {
    static class Point{
        public int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int n,m,len,answer = Integer.MAX_VALUE;
    static int[] comb;
    static ArrayList<Point> pz, hs;
    public static void DFS(int L, int S){
        if(L == m){
//            for (int x : comb) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
            int sum = 0;
            for(Point h : hs){
                int dis = Integer.MAX_VALUE;
                for (int x : comb) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(x).x) + Math.abs(h.y - pz.get(x).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else{
            for(int i = S; i < len; i++){
                comb[L] = i;
                DFS(L+1, i+1);
            }
        } //{0, 1}{0, 2}{0, 3}{1,2}{1,3}{2,3},{3,}
    }
    public static int solution(int n, int m, int[][] arr){
        pz = new ArrayList<Point>();
        hs = new ArrayList<Point>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1) hs.add(new Point(i, j));
                else if(arr[i][j] == 2) pz.add(new Point(i, j));
            }
        }
        len = pz.size();
        comb = new int[m];
        DFS(0,0);
        return answer;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n, m, arr));


    }
}
