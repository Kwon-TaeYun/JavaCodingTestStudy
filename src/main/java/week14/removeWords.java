package week14;

public class removeWords {
    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] token = my_string.split("");
        String mo = "aeiou";
        for (String t : token) {
            if(!mo.contains(t)){
                sb.append(t);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String my_string = "nice to meet you";
        String solution = solution(my_string);
        System.out.println(solution);
    }
}
