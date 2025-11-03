package week28;
import java.util.Scanner;
public class ReverseString {
    public static String solution(String sentence) {
        String answer = "";
        int left = 0;
        int right = sentence.length() - 1;
        char[] ch = sentence.toCharArray();
        while(left < right){
            if(!Character.isAlphabetic(ch[left])) {
                left++;
            }else if(!Character.isAlphabetic(ch[right])) {
                right--;
            }else {
                char tmp = ch[left];
                ch[left] = ch[right];
                ch[right] = tmp;
                left++;
                right--;
            }

        }

        sentence = String.valueOf(ch);

        return sentence;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

}
