package week21;

public class MoneyFolding {
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int minWallet = Math.min(wallet[0], wallet[1]);
        int maxWallet = Math.max(wallet[0], wallet[1]);
        int minBill = Math.min(bill[0], bill[1]);
        int maxBill = Math.max(bill[0], bill[1]);
        while(!(minBill <= minWallet && maxBill <= maxWallet)){
            if(bill[0] > bill[1]){
                bill[0] /= 2;
            }else{
                bill[1] /= 2;
            }
            minBill = Math.min(bill[0], bill[1]);
            maxBill = Math.max(bill[0], bill[1]);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] wallet = {30,15};
        int[] bill = {26,17};
        int solution = solution(wallet, bill);
        System.out.println(solution);
    }
}
