package week30;

import java.util.*;

public class WarnMessage {
    public int getTime(int hour, int minute){
        return hour * 60 + minute;
    }

    public String[] solution(String[] reports, int time){
        String[] answer = {};
        Map<String, Integer> inTime = new HashMap<>();
        Map<String, Integer> totalTime = new HashMap<>();

        for (String report : reports) {
            String[] rep = report.split(" ");
            String name = rep[0];//
            String[] times = rep[1].split(":");
            int hour = Integer.valueOf(times[0]);
            int minute = Integer.valueOf(times[1]);
            int t = getTime(hour, minute);//
            String inOut = rep[2];//

            if(inOut.equals("in")){
                inTime.put(name, t);
            }else{
                totalTime.put(name, totalTime.getOrDefault(name, 0) + (t - inTime.get(name)));
            }
        }

        List<String> list = new ArrayList<>();
        for (String name : totalTime.keySet()) {
            if(totalTime.get(name) > time){
                list.add(name);
            }
        }

        list.sort((a,b)->a.compareTo(b));
        answer = new String[list.size()];
        int i = 0;
        for (String s : list) {
            answer[i] = s;
            i++;
        }



        return answer;
    }

    public static void main(String[] args){
        WarnMessage T = new WarnMessage();
        System.out.println(Arrays.toString(T.solution(new String[]{"john 09:30 in", "daniel 10:05 in", "john 10:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 12:35 out", "daniel 15:05 out"}, 60)));
        System.out.println(Arrays.toString(T.solution(new String[]{"bill 09:30 in", "daniel 10:00 in", "bill 11:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 14:35 out", "daniel 14:55 out"}, 120)));
        System.out.println(Arrays.toString(T.solution(new String[]{"cody 09:14 in", "bill 09:25 in", "luis 09:40 in", "bill 10:30 out", "cody 10:35 out", "luis 10:35 out", "bill 11:15 in", "bill 11:22 out", "luis 15:30 in", "luis 15:33 out"}, 70)));
        System.out.println(Arrays.toString(T.solution(new String[]{"chato 09:15 in", "emilly 10:00 in", "chato 10:15 out", "luis 10:57 in", "daniel 12:00 in", "emilly 12:20 out", "luis 11:20 out", "daniel 15:05 out"}, 60)));
    }

}
