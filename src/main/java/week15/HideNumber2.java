package week15;

public class HideNumber2 {
    public static int solution(String my_string) {
        int answer = 0;
        String[] token = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        for (String t : token) {
            if(!t.equals("")){
                answer += Integer.parseInt(t);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }
}
