package week13;

public class Age {
    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String programmers_age = String.valueOf(age);
        System.out.println(programmers_age);
        for(int i = 0; i < programmers_age.length(); i++){
            System.out.println(programmers_age.charAt(i));

            sb.append((char)((int)programmers_age.charAt(i) + 49));
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        int age = 23;
        String solution = solution(age);
        System.out.println(solution);
    }
}
