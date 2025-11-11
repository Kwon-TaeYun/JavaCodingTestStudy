package week29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSNearestPath {
    static int[][] graph;
    static boolean[] checked;
    static int[] dist;
    static int cnt;
    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> map = new ArrayList<>();
    public static void BFS(int v){
        checked[v] = true;
        dist[v] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv = queue.poll();
            for (Integer nv : map.get(cv)) {
                if(!checked[nv]) {
                    checked[nv] = true;
                    queue.offer(nv);
                    dist[nv] = dist[cv] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        n = 6;
        m = 8;
        graph = new int[][]{{1,3},{1,4},{2,5},{3,4},{4,5},{4,6},{6,2},{6,5}};
        dist = new int[n+1];
        cnt = 1;
        checked = new boolean[n+1];
        for(int i = 0; i <= n; i++){
            map.add(new ArrayList<>());
        }
        for(int i = 0; i < graph.length; i++) {
            map.get(graph[i][0]).add(graph[i][1]);
        }
        
        BFS(1);

        System.out.println(Arrays.toString(dist));
    }
}
