package week13;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a"); morse.put("-...", "b"); morse.put("-.-.", "c"); morse.put("-..", "d");
        morse.put(".", "e"); morse.put("..-.", "f"); morse.put("--.", "g"); morse.put("....", "h");
        morse.put("..", "i"); morse.put(".---", "j"); morse.put("-.-", "k"); morse.put(".-..", "l");
        morse.put("--", "m"); morse.put("-.", "n"); morse.put("---", "o"); morse.put(".--.", "p");
        morse.put("--.-", "q"); morse.put(".-.", "r"); morse.put("...", "s"); morse.put("-", "t");
        morse.put("..-", "u"); morse.put("...-", "v"); morse.put(".--", "w"); morse.put("-..-", "x");
        morse.put("-.--", "y"); morse.put("--..", "z");

        String[] token = letter.split(" ");

        for(int i = 0; i < token.length; i++){
            sb.append(morse.get(token[i]));
        }
        return sb.toString();
    }


    public static void main(String[] args) {

    }
}

