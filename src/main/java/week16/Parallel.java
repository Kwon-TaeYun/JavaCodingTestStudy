package week16;

import java.util.ArrayList;
import java.util.List;

public class Parallel {
    public static int solution(int[][] dots) {
        int answer = 0;
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < dots.length; i++){
            for(int j = i+1; j < dots.length; j++){
                int ix = dots[i][0];
                int iy = dots[i][1];
                int jx = dots[j][0];
                int jy = dots[j][1];
                if(!nums.contains((jy - iy) / (jx - ix))){
                    nums.add((jy - iy) / (jx - ix));
                }else{
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] dots = {{1, 4},{9, 2},{3, 8},{11, 6}};
        System.out.println(solution(dots));
    }
}
