package week28;

import java.util.Scanner;

public class MountainTop {
    public static int solution(int[][] arr, int n){
        int answer = 0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean isPeak = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                        if(arr[i][j] <= arr[nx][ny]) isPeak =false;
                    }
                }
                if(isPeak == true) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(arr, n));
    }
}
