package week14;

public class ChangeIndex {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(i == num1){
                answer += my_string.charAt(num2);
            }else if(i == num2){
                answer += my_string.charAt(num1);
            }else{
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;
        String solution = solution(my_string, num1, num2);
        System.out.println(solution);

    }
}
