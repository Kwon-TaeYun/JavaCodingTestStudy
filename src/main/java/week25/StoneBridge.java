package week25;

public class StoneBridge {
    public static int solution(int[] stones, int k) {
        int answer = 0;
        int left = 1;
        int right = 0;
        for (int stone : stones) {
            right = Math.max(stone, right);
        }

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canCross(stones, k, mid)){
                answer = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return answer;
    } // 이분법으로 접근

    public static boolean canCross(int[] stones, int k, int n){
        int cnt = 0;
        for (int stone : stones) {
            if(stone - n < 0){
                cnt++;
                if(cnt >= k) return false;
            }else{
                cnt = 0;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        System.out.println(solution(stones, 3));
    }
}
