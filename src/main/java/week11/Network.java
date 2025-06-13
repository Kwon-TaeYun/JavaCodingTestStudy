package week11;

public class Network {
    public static int solution(int n, int[][] computers) {
        int count = 0;
        boolean[] isVisited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(!isVisited[i]){
                dfs(i, computers, isVisited);
                count++;
            }
        }
        return count;
    }

    public static void dfs(int current, int[][] computers, boolean[] isVisited){
        isVisited[current] = true;
        for(int j = 0; j < computers.length; j++){
            if(computers[current][j] == 1 && isVisited[j] == false){
                dfs(j, computers, isVisited);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0},{1, 1, 0},{0, 0, 1}};
        int answer = solution(n, computers);
        System.out.println("answer:: " + answer);
    }
}
