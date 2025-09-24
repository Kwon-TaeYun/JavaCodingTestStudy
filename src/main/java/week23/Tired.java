package week23;

public class Tired {
    static int answer = 0;
    public static int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        return answer;
    }

    public static void dfs(int k, int[][] dungeons, boolean[] visited, int count){
        answer = Math.max(count, answer);
        for(int i = 0; i < dungeons.length; i++){
            int tired = dungeons[i][0];
            int need = dungeons[i][1];
            if(!visited[i] && k >= tired){
                visited[i] = true;
                dfs(k-need, dungeons, visited, count+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(80, dungeons));
    }
}
