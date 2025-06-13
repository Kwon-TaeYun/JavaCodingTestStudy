package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Traveling {
    public static String[] solution(String[][] tickets) {
        List<String> answer = new ArrayList<>();
        boolean[] usedTicket = new boolean[tickets.length];
        answer.add("ICN");
        Arrays.sort(tickets, (a,b)->{
            if(a[0].equals(b[0])){
                return a[1].compareTo(b[1]);
            }else{
                return a[0].compareTo(b[0]);
            }
        });

        // 정렬된 티켓 출력
//        for (String[] ticket : tickets) {
//            System.out.println(Arrays.toString(ticket));
//        }
        dfs("ICN", tickets, usedTicket, answer, tickets.length);
        return answer.toArray(new String[0]);
    }

    public static boolean dfs(String current, String[][] tickets, boolean[] usedTicket, List<String> answer, int total){
        if(answer.size() == total + 1){
            return true;
        }

        for(int i = 0; i < tickets.length; i++){
            if(!usedTicket[i] && tickets[i][0].equals(current)){
                usedTicket[i] = true;
                answer.add(tickets[i][1]);

                if(dfs(tickets[i][1], tickets, usedTicket, answer, total)){
                    return true;
                }

                // 백트래킹
                usedTicket[i] = false;
                answer.remove(answer.size() - 1);

            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"},{"HND", "IAD"},{"JFK", "HND"}};
        String[] answer = solution(tickets);
        System.out.println("answer:::" + Arrays.toString(answer));
    }
}
