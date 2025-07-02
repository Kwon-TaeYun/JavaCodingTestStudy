package week14;

public class game369 {
    public static int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        String num = "369";
        String[] token = s.split("");
        for (String t : token) {
            if(num.contains(t)){
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int order = 29423;
        int solution = solution(order);
        System.out.println(solution);
    }


}
