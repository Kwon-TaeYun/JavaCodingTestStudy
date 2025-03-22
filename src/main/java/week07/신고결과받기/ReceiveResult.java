package week07.신고결과받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReceiveResult {
    public static int[] solution(String[] id_list, String[] report, int k) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> userMessageList = new HashMap<>(); //누가 누굴 신고 몇번?
        HashMap<String, Integer> userAlertList = new HashMap<>(); //신고 당한 사람 몇번?
        HashMap<String, Integer> userList = new HashMap<>(); //신고 한 사람 몇번?

        // 신고 내역 처리
        for(int i = 0; i < report.length; i++){
            String[] reportArray = report[i].split(" ");
            if(reportArray[0] != reportArray[1]) {
                userMessageList.put(report[i], userMessageList.getOrDefault(report[i], 0) + 1);
            }
        }
        // 신고 내역을 출력
        System.out.println("신고 내역 ::" + userMessageList);

        // 신고 당한 사람들의 신고 횟수 처리
        for(int i = 0; i < report.length; i++){
            String[] reportArray = report[i].split(" ");
            userAlertList.put(reportArray[1], userAlertList.getOrDefault(reportArray[1], 0) + 1);
        }
        // 신고 당한 사람들의 신고 횟수 출력
        System.out.println("신고 당한 사람 ::" + userAlertList);

        // 신고당한 사람이 k번 이상 신고를 받았으면 신고한 사람에게 메일 발송
        List<String> keyset = new ArrayList<>(userMessageList.keySet());

        for(int i = 0; i < keyset.size(); i++){
            String[] split = keyset.get(i).split(" ");
            Integer value = userMessageList.get(keyset.get(i));
            int total = value - 1;
            if(value > 1){
                int restValue = userAlertList.getOrDefault(split[1], 0) - total; // null 방지
                userAlertList.put(split[1], restValue);
                userMessageList.put(keyset.get(i), restValue);
            }
        }

        // 신고 당한 사람들의 상태 출력
        System.out.println(userAlertList);
        System.out.println(userMessageList);

        // 마지막으로 신고당한 사람들에게 메일 발송
        for(int i = 0; i < report.length; i++){
            String[] split = report[i].split(" ");
            if(userAlertList.get(split[1]) >= k){
                userList.put(split[0], userList.getOrDefault(split[0], 0) + 1);
            }
        }
        // 신고한 사람들에게 메일 발송 횟수 출력
        System.out.println(userList);

        // 최종적으로 메일을 받는 횟수를 반환
        for (String id : id_list) {
            if(userList.containsKey(id)){
                answer.add(userList.get(id));
            }else {
                answer.add(0);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] output = solution(id_list, report, k);
        System.out.println(Arrays.toString(output));
    }
}
