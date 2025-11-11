package week29;

import java.util.ArrayList;
import java.util.List;

public class NearestPath {
    static boolean[] checked;
//    static int[][] map;
    static ArrayList<ArrayList<Integer>> map;
    static int n;
    static int m;
    static int answer;
    public static void dfs(int v){
        if(v == n){
            answer++;
        }else{
           for(int nv : map.get(v)){
               if(!checked[nv]) {
                   checked[v] = true;
                   dfs(nv);
                   checked[v] = false;
               }
           }
        }
    }

    public static int solution(int[][] path){
        n = 5;
        m = 9;
        answer = 0;
        checked = new boolean[n+1];
//        map = new int[n+1][n+1];
//        for (int[] road : path) {
//            map[road[0]][road[1]] = 1;
//        }
        map = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++){
            map.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < m; i++){
            int a = path[i][0];
            int b = path[i][1];
            map.get(a).add(b);
        }
        checked[1] = true;

        dfs(1);
        return answer;
    }
    public static void main(String[] args) {
        int[][] path = {{1,2},{1,3},{1,4},{2,1},{2,3},{2,5},{3,4},{4,2},{4,5}};
        System.out.println(solution(path));

    }
}
