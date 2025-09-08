package week23;

import java.util.HashMap;
import java.util.Map;

public class TakenGift {
    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int n = friends.length;
        Map<String, Integer> friendIndex = new HashMap<>();
        for(int i = 0; i < n; i++){
            friendIndex.put(friends[i], i);
        }
        int[] given = new int[n];
        int[] received = new int[n];
        int[][] pairGifts = new int[n][n];

        //이번 달
        for (String gift : gifts) {
            String[] token = gift.split(" ");
            String give = token[0];
            String receive = token[1];

            int i = friendIndex.get(give);
            int j = friendIndex.get(receive);

            pairGifts[i][j]++;
            given[i]++;
            received[j]++;
        }

        //다음 달
        int[] nextDayPairGifts = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int fromItoJ = pairGifts[i][j];
                int fromJtoI = pairGifts[j][i];

                if(fromItoJ > fromJtoI){
                    nextDayPairGifts[i]++;
                }else if(fromJtoI > fromItoJ){
                    nextDayPairGifts[j]++;
                }else{
                    int iScore = given[i] - received[i];
                    int jScore = given[j] - received[j];
                    if(iScore > jScore){
                        nextDayPairGifts[i]++;
                    }else if(jScore > iScore){
                        nextDayPairGifts[j]++;
                    }
                }

            }
        }

        int max = 0;
        for (int val : nextDayPairGifts) {
            max = Math.max(max, val);
        }

        return max;
    }

    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends, gifts));
    }
}
