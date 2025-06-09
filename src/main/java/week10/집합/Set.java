package week10.집합;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set {
    static int[] parentSet;
    public static void union(int x, int y){
        int a = parentSet[x]; // 1
        int b = parentSet[y]; // 2
        parentSet[b] = a;
    }
      // 0(0)-1-2
    public static int find(int x){
        if(parentSet[x] == x){
            return x;
        }

        x = find(parentSet[x]);
        return parentSet[x];
    }

    public static Boolean[] solution(int k, int[][] operation){
        parentSet = new int[k];
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < k; i++){
            parentSet[i] = i;
        }

        for(int i = 0; i < operation.length; i++){
            if(operation[i][0] == 0){
                union(operation[i][1], operation[i][2]);
                //System.out.println(Arrays.toString(parentSet));
            }else{
                result.add(find(operation[i][1]) == find(operation[i][2]));
            }
        }
        //System.out.println(Arrays.toString(parentSet));
        return result.toArray(new Boolean[0]);
    }

    public static void main(String[] args) {
        int k = 3;
        int[][] operation = {{0,0,1},{1,1,2},{0,1,2}, {1,0,2}};
        Boolean[] answer = solution(k, operation);
        System.out.println(Arrays.toString(answer));
    }
}
