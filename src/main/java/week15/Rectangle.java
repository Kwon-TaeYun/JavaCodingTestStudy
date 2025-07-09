package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rectangle {
    public static int solution(int[][] dots) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for(int i = 0; i < dots.length; i++){
            if(!x.contains(dots[i][0])){
                x.add(dots[i][0]);
            }
            if(!y.contains(dots[i][1])){
                y.add(dots[i][1]);
            }
        }

        Integer[] xArray = x.toArray(new Integer[0]);
        Integer[] yArray = y.toArray(new Integer[0]);
        return (Math.max(xArray[0], xArray[1]) - Math.min(xArray[0], xArray[1]))*(Math.max(yArray[0], yArray[1]) - Math.min(yArray[0], yArray[1]));
    }

    public static void main(String[] args) {
        int[][] dots = {{1,1},{2,1},{2,2},{1,2}};
        int solution = solution(dots);
        System.out.println(solution);
    }

}
