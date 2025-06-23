package week13;

import java.util.Arrays;
import java.util.TreeMap;

public class DoublePriorityQueue {
    public static int[] solution(String[] operations) {
        int[] answer = {};
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (String o : operations) {
            String[] split = o.split(" ");
            if(split[0].equals("I")){
                treeMap.put(Integer.parseInt(split[1]), treeMap.getOrDefault(Integer.parseInt(split[1]), 0) + 1);
            }else{
                if(treeMap.isEmpty()){
                    continue;
                }

                int key = split[1].equals("1") ? treeMap.lastKey() : treeMap.firstKey();

                if(treeMap.get(key) == 1){
                    treeMap.remove(key);
                }else{
                    treeMap.put(key, treeMap.get(key) - 1);
                }

            }
        }

        return treeMap.isEmpty() ? new int[]{0,0} : new int[]{treeMap.lastKey(), treeMap.firstKey()};
    }

    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] solution = solution(operations);
        System.out.println("solution ::: " + Arrays.toString(solution));
    }
}
