package week21;

public class DualPassword {
    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (char c : alphabet.toCharArray()) {
            if(!skip.contains(String.valueOf(c))){
                sb.append(c);
            }
        }
//        System.out.println(sb);
        String str = sb.toString();
        int len = str.length();
        for(char ch :s.toCharArray()){
            int now = str.indexOf(ch);
            answer.append(str.charAt((now+index) % len));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(solution(s, skip, index));
    }
}
