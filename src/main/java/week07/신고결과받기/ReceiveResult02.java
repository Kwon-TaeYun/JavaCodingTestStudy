package week07.신고결과받기;

import java.util.*;

public class ReceiveResult02 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        List<Integer> answer = new ArrayList<>();
        Set<String> userMessageSet = new HashSet<>(); //누가 누굴 신고 몇번?
        HashMap<String, Integer> userAlertList = new HashMap<>(); //신고 당한 사람 몇번?
        HashMap<String, Integer> userList = new HashMap<>(); //신고 한 사람 몇번?

        for(int i = 0; i < report.length; i++){
            userMessageSet.add(report[i]);
        }
//        System.out.println("신고 내역 ::" + userMessageSet);


        for(String value : userMessageSet){
            String[] split = value.split(" ");
            userAlertList.put(split[1], userAlertList.getOrDefault(split[1], 0) + 1);
        }
//        System.out.println(userAlertList);
//
        for(String value : userMessageSet){
            String[] split = value.split(" ");
            if(userAlertList.get(split[1]) >= k){
                userList.put(split[0], userList.getOrDefault(split[0], 0) + 1);
            }
        }
//        System.out.println(userList);
//
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
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] output = solution(id_list, report, k);
        System.out.println(Arrays.toString(output));
    }
}
