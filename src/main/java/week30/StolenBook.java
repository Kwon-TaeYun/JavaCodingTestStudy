package week30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StolenBook {
    class Info{
        String name;
        int time;
        public Info(String name, int time){
            this.name = name;
            this.time = time;
        }
    }
    public int getTime(int hour, int minute){
        return hour * 60 + minute;
    }
    public String[] solution(String[] reports, String times){
        String[] time = times.split(" ");
        String[] sT = time[0].split(":");
        String[] eT = time[1].split(":");
        int start = getTime(Integer.valueOf(sT[0]), Integer.valueOf(sT[1]));
        int end = getTime(Integer.valueOf(eT[0]), Integer.valueOf(eT[1]));

        List<Info> tmp = new ArrayList<>();
        for (String report : reports) {
            String[] rep = report.split(" ");
            String name = rep[0];
            String[] st = rep[1].split(":");
            int t = getTime(Integer.valueOf(st[0]), Integer.valueOf(st[1]));

            tmp.add(new Info(name, t));
        }

        tmp.sort((a,b)->a.time - b.time);

        List<String> res = new ArrayList<>();

        for (Info info : tmp) {
            if(info.time >= start && info.time <= end){
                res.add(info.name);
            }

            if(info.time > end) break;
        }

        String[] answer = new String[res.size()];
        for(int i = 0; i < res.size(); i++){
            answer[i] = res.get(i);
        }




        return answer;
    }

    public static void main(String[] args){
        StolenBook T = new StolenBook();
        System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
        System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
        System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
    }

}
