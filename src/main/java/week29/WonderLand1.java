package week29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WonderLand1 {
    static int[] unf;
    static class Edge{
        int v1;
        int v2;
        int cost;

        public Edge(int v1, int v2, int cost){
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
    }

    public static void union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb){
            unf[fa] = fb;
        }
    }

    public static int find(int v){
        if(v == unf[v]) return unf[v];
        else{
            return unf[v] = find(unf[v]);
        }
    }

    public static int solution(int V, int E, int[][] edges) {
        int answer = 0;
        unf = new int[V+1];// 여기에 최소 스패닝 트리 알고리즘 구현
        for(int i = 1; i <= V; i++){
            unf[i] = i;
        }
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);
        ArrayList<Edge> list = new ArrayList<>();
        for(int i = 0; i < E; i++){
            list.add(new Edge(edges[i][0], edges[i][1], edges[i][2]));
        }

        for (Edge edge : list) {
            if(find(edge.v1) != find(edge.v2)){
                union(edge.v1, edge.v2);
                answer += edge.cost;
            }
        }
        return answer; // 예시, 실제 최소비용 계산 후 반환
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V = in.nextInt(); // 도시 수
        int E = in.nextInt(); // 도로 수

        int[][] edges = new int[E][3];
        for (int i = 0; i < E; i++) {
            edges[i][0] = in.nextInt(); // A
            edges[i][1] = in.nextInt(); // B
            edges[i][2] = in.nextInt(); // C
        }

        System.out.println(solution(V, E, edges));
    }
}
