package week28;

import java.util.Scanner;

public class MountainTop {
    public static int solution(int[][] arr, int n, int m) {
        int answer = 0;

        for (int i = 1; i <= n; i++) { // i: 멘토 후보
            for (int j = 1; j <= n; j++) { // j: 멘티 후보
                if (i == j) continue;
                boolean canPick = true;

                for (int k = 0; k < m; k++) { // m번의 시험
                    int mentorRank = 0, menteeRank = 0;
                    for (int s = 0; s < n; s++) { // 각 시험에서 등수 위치 찾기
                        if (arr[k][s] == i) mentorRank = s;
                        if (arr[k][s] == j) menteeRank = s;
                    }
                    if (mentorRank > menteeRank) { // 멘토가 멘티보다 뒤에 있으면 불가능
                        canPick = false;
                        break;
                    }
                }

                if (canPick) answer++;
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
