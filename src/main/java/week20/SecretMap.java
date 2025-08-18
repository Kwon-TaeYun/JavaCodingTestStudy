package week20;

import java.util.Arrays;

public class SecretMap {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            int line = arr1[i] | arr2[i];
//            String binaryString = Integer.toBinaryString(line);
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(line));
            System.out.println(binaryString);
            answer[i] = binaryString.replace('1','#').replace('0', ' ');
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] solution = solution(n, arr1, arr2);
        System.out.println(Arrays.toString(solution));
    }
}
