package week17;

public class ConcealPhoneNum {
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        String[] token = phone_number.split("");
        for(int i = 0; i < token.length - 4; i++){
            sb.append("*");
        }
        for(int i = token.length - 4; i < token.length; i++){
            sb.append(token[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }
}
