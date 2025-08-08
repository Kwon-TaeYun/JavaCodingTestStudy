package week19;

public class CalculateMinusMoney {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i <= count; i++){
            answer += (price * i);
        }
        answer =  answer - (long)money;
        if(answer < 0){
            return 0;
        }else{
            return answer;
        }
    }

    public static void main(String[] args) {

    }
}
