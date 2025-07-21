package week16;

public class ChickenCoupon {
    public static int solution(int chicken) { //1081
        int answer = 0; //108 + 1 + 1

        while (chicken >= 10) {
            int service = chicken / 10;
            int remain = chicken % 10;

            answer += service;
            chicken = service + remain; // 다음 순환을 위해 교환된 치킨에서 나온 쿠폰 + 남은 쿠폰
        }
        return answer;
    }

    public static void main(String[] args) {
        int chicken = 1081;
        System.out.println(solution(chicken));
    }
}
