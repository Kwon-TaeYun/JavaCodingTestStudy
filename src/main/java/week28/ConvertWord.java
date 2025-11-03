package week28;
import java.util.*;
public class ConvertWord {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String input = in.next();
        StringBuilder sb = new StringBuilder();
        for(char s : input.toCharArray()){
            if(Character.isLowerCase(s)){
                sb.append(Character.toUpperCase(s));
            }else{
                sb.append(Character.toLowerCase(s));
            };//대문자: 65 ~ 90, 소문자: 97 ~ 122
        }
        System.out.println(sb.toString());
    }
}
