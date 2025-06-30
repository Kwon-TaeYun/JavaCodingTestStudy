package week14;

public class RemoveDuplicateWord {
    public static String solution(String my_string) {
        String answer = "";
        String[] token = my_string.split("");
        for (String t : token) {
            if(!answer.contains(t)){
                answer+=t;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "people";
        String solution = solution(my_string);
        System.out.println(solution);
    }
}
