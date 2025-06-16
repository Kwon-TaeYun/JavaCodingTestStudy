package week12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//BFS
public class ConvertWord {
    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        List<String> wordList = Arrays.asList(words);
        if(!wordList.contains(target)){
            return 0;
        }

        Queue<String[]> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[wordList.size()];

        queue.add(new String[]{begin, "0"}); //초기값 넣음.
        while(!queue.isEmpty()){
            String[] current = queue.remove();
            String currentWord = current[0];
            int step = Integer.parseInt(current[1]);
            if(currentWord.equals(target)){
                return step;
            }

            for(int i = 0; i < words.length; i++){
                if(canConvert(currentWord, words[i]) && !isVisited[i]){
                    queue.add(new String[]{words[i], String.valueOf(step+1)});
                    isVisited[i] = true;
                }
            }

        }

        return 0;

    }

    public static boolean canConvert(String word1, String word2){
        int diff = 0;
        for(int i = 0; i < word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i)){
                diff++;
            }
        }

//        if(diff == 1){
//            return true;
//        }
//
//        return false;

        return diff == 1;
    }

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        int result = solution(begin, target, words);
        System.out.println("result::: " + result);
    }
}
