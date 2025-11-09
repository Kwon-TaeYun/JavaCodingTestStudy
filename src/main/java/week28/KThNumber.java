package week28;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KThNumber {
    public static int solution(int m, int n ,int[] arr){
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());//꼭 기억!!!
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    set.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int count = 0;
        for (Integer s : set) {
            count++;
            if(count == n){
                return s;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // solution 호출
        System.out.println(solution(n, m, arr));
    }
}
