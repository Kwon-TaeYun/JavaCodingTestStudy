package week28;
import java.util.Scanner;

public class ReversePrimeNumber {

    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static String solution(int n, int[] arr){
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            String s = String.valueOf(arr[i]);
            int x = Integer.parseInt(new StringBuilder(s).reverse().toString());
            if(isPrime(x)){
                answer.append(x + " ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input2 = new int[input1];
        for(int i = 0; i < input1; i++){
            input2[i] = in.nextInt();
        }
        System.out.println(solution(input1, input2));
    }
}
