package week26;

public class ExpressNum {
    public static int solution(int n) {
        int answer = 0;
        for(int k = 1; k*(k-1)/2 < n; k++){
            int remain = n - k*(k-1)/2;
            if(remain % k == 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
