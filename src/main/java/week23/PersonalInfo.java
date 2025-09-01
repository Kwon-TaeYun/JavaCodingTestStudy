package week23;

import java.util.*;

public class PersonalInfo {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] token = term.split(" ");
            termMap.put(token[0], Integer.parseInt(token[1]));
        }

        String[] todayParts = today.split("\\.");
        int tYear = Integer.parseInt(todayParts[0]);
        int tMonth = Integer.parseInt(todayParts[1]);
        int tDay = Integer.parseInt(todayParts[2]);

        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String date = parts[0];
            String type = parts[1];

            String[] dateParts = date.split("\\.");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);

            int duration = termMap.get(type);
            month += duration;
            year += (month - 1) / 12;
            month = (month - 1) % 12 + 1;

            if (year < tYear || (year == tYear && month < tMonth) || (year == tYear && month == tMonth && day <= tDay)) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }
}
