package week06.압축;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Press {
    public static int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> dictionary = new HashMap<>();
        for(int i = 0; i < 26; i++){
            dictionary.put(String.valueOf((char)('A' + i)), i+1);
        }//A부터 Z까지 담음...
        int nextIndex = 27;
        String[] words = msg.split("");
//        for(int i = 0; i < words.length-1; i++){
////            System.out.println(words[i] + words[i+1]);
//            String wordSum = words[i] + words[i+1];
//            if(dictionary.containsKey(wordSum)){
//                answer.add(dictionary.get(wordSum));
//            }
//            answer.add(dictionary.get(words[i]));
//            dictionary.put(wordSum, nextIndex);
//            nextIndex++;
//        }
        int i = 0;
        String word = words[0]; //K
        while(i < words.length - 1){
            if(!dictionary.containsKey(word+words[i+1])){ //AK
                int num = dictionary.get(word);//A
                dictionary.put(word+ words[i+1], nextIndex);//AK,28
                nextIndex++;//29
                answer.add(num);//1
                word=words[i+1];//K
            }else{
                word+=words[i+1];
            }
            i++;
        }

        answer.add(dictionary.get(word));

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        int[] output = solution(msg);
        System.out.println(Arrays.toString(output));
    }
}
