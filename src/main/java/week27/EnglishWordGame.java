package week27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EnglishWordGame {
    public static int[] solution(int n, String[] words) {
        Set<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);
        for(int i = 1; i < words.length; i++){
            if(wordSet.contains(words[i]) || words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)){
                return new int[]{i % n + 1, i / n + 1};
            }
            wordSet.add(words[i]);
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution(3, words)));
    }
}
