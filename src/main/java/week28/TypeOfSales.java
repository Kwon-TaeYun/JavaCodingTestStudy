package week28;

import java.util.*;

public class TypeOfSales {
    public static String solution(int n, int m, int[] arr){
        StringBuilder sb = new StringBuilder();
        int len = n - m + 1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        sb.append(map.size() + " ");

        for(int i = 0; i < len - 1; i++){
            map.put(arr[i], map.get(arr[i]) - 1);
            if(map.get(arr[i]) == 0) {
                map.remove(arr[i]);
            }
            map.put(arr[i+m], map.getOrDefault(arr[i+m], 0) + 1);
            sb.append(map.size() + " ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}
