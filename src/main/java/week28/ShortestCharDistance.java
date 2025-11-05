package week28;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestCharDistance {
    public static int[] solution(String sentence, char t) {
        int n = sentence.length();
        int[] dist = new int[n];
        int prev = -100;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == t){
                prev = i;
            }
            dist[i] = i - prev;
        }

        prev = 1000;
        for(int i = n - 1; i >= 0; i--){
            if(sentence.charAt(i) == t){
                prev = i;
            }
            dist[i] = Math.min(prev - i, dist[i]);
        }

        return dist;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] parts = in.nextLine().split(" ");
        String input1 = parts[0];
        char input2 = parts[1].charAt(0);
        System.out.println(solution(input1, input2));
    }

    //teachermode e
    //100 0 1 2 3 0 1 2 3 4 0
}
