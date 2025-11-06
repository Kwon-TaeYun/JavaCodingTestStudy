package week28;

import java.util.Scanner;

public class Mentoring {
    public static int solution(int[][] arr, int n, int m){
        int answer = 0;
        for(int i = 1; i <= n; i++){//멘토
            for(int j = 1; j <= n; j++){//멘티
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int mento = 0, mentee = 0;
                    for(int s = 0; s < n; s++){
                        if(arr[k][s] == i) mento = s;
                        if(arr[k][s] == j) mentee = s;
                    }
                    if(mento < mentee) cnt++;
                }
                if(cnt == m) answer++;

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 학생 수
        int m = in.nextInt(); // 시험 횟수
        int[][] arr = new int[m][n]; // 시험 결과 저장

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(arr, n, m));
    }
}
