package week28;

import java.util.Arrays;
import java.util.Scanner;

public class CheckDuplicate {
    public static Character solution(int[] moves){
        Character answer = ' ';
        Arrays.sort(moves);
        for(int i = 0; i < moves.length - 1; i++){
            if(moves[i] == moves[i+1]) return 'D';
        }

        return 'U';
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] moves = new int[n];

        for (int i = 0; i < n; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution(moves));
    }
}
