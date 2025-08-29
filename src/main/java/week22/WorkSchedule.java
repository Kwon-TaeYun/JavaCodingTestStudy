package week22;

public class WorkSchedule {
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int n = schedules.length;

        for(int i = 0; i < n; i++){
            boolean eligible = true; // 직원별 초기화

            for(int j = 0; j < 7; j++){
                int dayOfWeek = (startday -1 + j) % 7;
                if(dayOfWeek == 5 || dayOfWeek == 6) continue;

                int scheduleTime = schedules[i];
                int logTime = timelogs[i][j];

                int scheduledHour = scheduleTime / 100;
                int scheduledMin = scheduleTime % 100;

                // 10분 더하기
                scheduledMin += 10;
                if(scheduledMin >= 60){
                    scheduledHour += 1;
                    scheduledMin -= 60;
                }

                int allowedTime = scheduledHour * 100 + scheduledMin;

                if(logTime > allowedTime){
                    eligible = false;
                    break;
                }
            }

            if(eligible){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] schedules = {700, 800, 1100};
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659},
                {800, 801, 805, 800, 759, 810, 809},
                {1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int startday = 5;
        System.out.println(solution(schedules, timelogs, startday));
    }
}
