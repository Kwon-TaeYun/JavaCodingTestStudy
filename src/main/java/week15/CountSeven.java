package week15;

public class CountSeven {
    public static int solution(int[] array) {
        int answer = 0;
        for (int a : array) {
            String s = String.valueOf(a);
            for (char c : s.toCharArray()) {
                if(c == '7'){
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        int solution = solution(array);
        System.out.println(solution);
    }
}
