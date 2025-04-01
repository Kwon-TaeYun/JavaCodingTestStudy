package week07.메뉴리뉴얼;

import java.util.*;

public class MenuReNewal {
    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        HashMap<String, Integer> ordersMap = new HashMap<>();

        for(String s : orders){
            char[] cA = s.toCharArray();
            Arrays.sort(cA);
            for(int i : course) {
                combination(cA, 0, "", i, ordersMap);
            }
        }

        System.out.println(ordersMap);
        Set<String> keySet = ordersMap.keySet();
        List<String> keyList = new ArrayList<>(keySet);
        for(int i = 0; i < keyList.size(); i++){
            if(ordersMap.get(keyList.get(i)) < 2){
                ordersMap.remove(keyList.get(i));
            }
        }
        System.out.println(ordersMap);
        keyList = new ArrayList<>(ordersMap.keySet());
        keyList.sort((e1, e2) -> {
            Integer val1 = ordersMap.get(e1);
            Integer val2 = ordersMap.get(e2);
            int freqDiff = val2.compareTo(val1);
            if (freqDiff != 0) return freqDiff;

            return e2.length() - e1.length();
        });
        for (String s : keyList) {
            System.out.println(s + "::" + ordersMap.get(s));
        } //주석 예정

//        for()




        return answer;
    }

    public static void combination(char[] order, int start, String current, int length, Map<String, Integer> orderMap){
        if(length == current.length()){
            orderMap.put(current, orderMap.getOrDefault(current, 0) + 1);
            return;
        }
        for(int i = start; i < order.length; i++){
            combination(order, i+1, current+order[i], length, orderMap);
        }
    }


    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        String[] output = solution(orders, course);
        System.out.println(Arrays.toString(output));
    }
}
