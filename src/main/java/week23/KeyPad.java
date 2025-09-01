package week23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KeyPad {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> pressKey = new HashMap<>();
        for (String k : keymap) {
            for(int i = 0; i < k.length(); i++){
                char c = k.charAt(i); //0, -1
                int press = i+1;
                pressKey.put(c, Math.min(press, pressKey.getOrDefault(c, Integer.MAX_VALUE)));
            }
        }

//        for (Character key : pressKey.keySet()) {
//            System.out.println(key + " -> " + pressKey.get(key));
//        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            boolean possible = true;
            for (char c : target.toCharArray()) {
                if(!pressKey.containsKey(c)){
                    possible = false;
                    break;
                }
                answer[i] += pressKey.get(c);
            }

            answer[i] = possible ? answer[i] : -1;
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] keymap = {"AA"};
        String[] targets = {"B"};
        System.out.println(Arrays.toString(solution(keymap, targets)));
    }
}
