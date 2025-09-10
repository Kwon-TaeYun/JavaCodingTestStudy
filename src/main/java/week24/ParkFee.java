package week24;

import java.util.*;

public class ParkFee {
    public static int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inTime = new HashMap<>();
        Map<String, Integer> totalTime = new HashMap<>();
        for (String record : records) {
            String[] token = record.split(" ");
            String[] token1 = token[0].split(":");
            int time = Integer.parseInt(token1[0]) * 60 + Integer.parseInt(token1[1]);
            String car = token[1];
            String inOrOut = token[2];
            if(inOrOut.equals("IN")){
                inTime.put(car, time);
            }else{
                if(inTime.containsKey(car)){
                    int parked = time - inTime.get(car);
                    totalTime.put(car, totalTime.getOrDefault(car, 0) + parked);
                    inTime.remove(car);
                }
            }
        }

        int endOfDay = 23 * 60 + 59;
        for (String car : inTime.keySet()) {
            int parked = endOfDay - inTime.get(car);
            totalTime.put(car, totalTime.getOrDefault(car, 0) + parked);
        }

        List<String> cars = new ArrayList<>(totalTime.keySet());
        Collections.sort(cars);
        int[] answer = new int[cars.size()];

        for (int i = 0; i < cars.size(); i++) {
            int time = totalTime.get(cars.get(i));
            if(time <= fees[0]){
                answer[i] = fees[1];
            }else{
                answer[i] = fees[1] + (int)Math.ceil((time - fees[0]) / (double)fees[2]) * fees[3];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {
                "05:34 5961 IN", "06:00 0000 IN",
                "06:34 0000 OUT", "07:59 5961 OUT",
                "07:59 0148 IN", "18:59 0000 IN",
                "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"
        };
        System.out.println(Arrays.toString(solution(fees, records)));
    }
}
