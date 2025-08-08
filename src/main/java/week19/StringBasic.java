package week19;

public class StringBasic {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            boolean matches = s.matches("-?\\d+");
            return matches;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
