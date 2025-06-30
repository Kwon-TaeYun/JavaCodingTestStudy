package week14;

public class AddNumber {
    public static int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if(Character.isDigit(c)){
                answer += (c - '0');
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int solution = solution(my_string);
        System.out.println(solution);
    }
}
