package week28;
import java.util.Scanner;
public class WordPalindome {
    public static String solution(String sentence) {
//        String answer = "";
        sentence = sentence.toLowerCase();
//        int left = 0, right = sentence.length() - 1;
//        while(left < right){
//            if(ch[left] != ch[right]) return "NO";
//            left++;
//            right--;
//        }
        for(int i = 0; i < sentence.length() / 2; i++){
            if(sentence.charAt(i) != sentence.charAt(sentence.length() - i - 1)){
                return "NO";
            }
        }
        return "YES";

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));

    }
}
