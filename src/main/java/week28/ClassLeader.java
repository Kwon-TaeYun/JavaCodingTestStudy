package week28;

import java.util.*;

public class ClassLeader {
    public static Character solution(int n, String str){
        Map<Character, Integer> map = new HashMap<>();
        int answer = 0;
        char leader = ' ';
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Set<Character> set = map.keySet();
        for (Character c : set) {
            if(map.get(c) > answer){
                answer = map.get(c);
                leader = c;
            }
        }

        return leader;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
    }
}
