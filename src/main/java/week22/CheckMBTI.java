package week22;

import java.util.HashMap;
import java.util.Map;

public class CheckMBTI {
    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        char[] types = {'R','T','C','F','J','M','A','N'};
        for (char t : types) {
            map.put(t, 0);
        }
        for(int i = 0; i < survey.length; i++){
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            int choice = choices[i];
            if(choice < 4){
                map.put(first, map.get(first) + (4 - choice));
            }else if(choice > 4){
                map.put(second, map.get(second) + (choice - 4));
            }
        }
        answer.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        answer.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        answer.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        answer.append(map.get('A') >= map.get('N') ? 'A' : 'N');

        return answer.toString();
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String solution = solution(survey, choices);
        System.out.println(solution);
    }
}
