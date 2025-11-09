package week28;

import java.util.Arrays;
import java.util.Scanner;

public class Friend {
    public static String solution(int[] friends){
        StringBuilder sb = new StringBuilder();
        int[] result = new int[2];
        int[] clone = friends.clone();
        Arrays.sort(clone);

        for(int i = 0; i < friends.length; i++){
            if(friends[i] > clone[i]){
                result[0] = i+1;
            }

            else if(friends[i] < clone[i]){
                result[1] = i+1;
            }
        }

        for (int i : result) {
            sb.append(i + " ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m = in.nextInt();

        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution(moves));
    }
}
