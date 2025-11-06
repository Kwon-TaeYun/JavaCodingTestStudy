package week28;

import java.util.Scanner;

public class Fibonacci {
    public static String solution(int n){
        StringBuilder sb = new StringBuilder();
        int[] fibo = new int[n+1];
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i < n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int i = 0; i < n; i++){
            sb.append(fibo[i] + " ");
        }

        return sb.toString();
    }

    //int a = 1, b = 1, c;
    //for(int i = 2; i < n; i++){
    // c = a + b;
    // a = b;
    // b = c;
    //}

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(solution(input1));
    }
}
