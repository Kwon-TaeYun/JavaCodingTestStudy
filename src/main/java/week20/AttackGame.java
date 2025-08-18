package week20;

public class AttackGame {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 0; i < number; i++){
            int divisorCount = countDivisors(i+1);
            if(divisorCount > limit){
                answer += power;
            }else{
                answer += divisorCount;
            }
        } //attacks

        return answer;
    }

    // 약수 개수 구하는 메서드
    private static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++; // i는 약수
                if (i != num / i) { // 대칭 약수
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int solution = solution(5, 3, 2);
        System.out.println(solution);
    }
}
