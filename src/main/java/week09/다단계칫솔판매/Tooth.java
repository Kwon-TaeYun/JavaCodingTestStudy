package week09.다단계칫솔판매;

import java.util.Arrays;
import java.util.HashMap;

public class Tooth {
    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        HashMap<String, Integer> sellerAmount = new HashMap<>();
        HashMap<String,Integer> enrollMap = new HashMap<>();

        for (int i = 0; i < enroll.length; i++) {
            enrollMap.put(enroll[i], i);
        }
//        System.out.println(sellerAmount);
//        System.out.println(enrollMap);
        for(int i = 0; i < seller.length; i++){
            sell(seller[i], amount[i] * 100, referral, sellerAmount, enrollMap);
        }
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = sellerAmount.getOrDefault(enroll[i], 0);
        }
        return answer;
    }

    public static void sell(
            String seller, int amount, String[] referrels,
            HashMap<String, Integer> sellerAmount, HashMap<String,Integer> enrollMap){
        while(!seller.equals("-") && amount > 0){
            int amountA = (int) (amount * 0.1); //추천인께 주는 돈
            int amountB = amount - amountA; //자기가 받는 이득
//            System.out.println(sellerAmount);
            sellerAmount.put(seller, sellerAmount.getOrDefault(seller, 0) + amountB);

            seller = referrels[enrollMap.get(seller)];
            amount = amountA;
//            sell(referrel, referrels[enrollMap.get(referrel)], sellerAmount.get(referrel), referrels, sellerAmount, enrollMap);
        }

    }

    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        int[] output = solution(enroll, referral, seller, amount);
        System.out.println(Arrays.toString(output));
    }
}
