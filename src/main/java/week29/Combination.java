package week29;

import java.util.Scanner;

public class Combination {
    public static int comb(int n, int r){
        if(r == 1 || r == n - 1) return n;
        else{
            return solution(n-1, r-1) + solution(n-1, r);
        }
    }
    public static int solution(int n, int r){
        return comb(n, r);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        System.out.println(solution(input1, input2));
    }
}
