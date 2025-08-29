package week22;

import java.util.*;

public class DataAnalyze {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        Integer extIdx = map.get(ext);
        Integer sortIdx = map.get(sort_by);
        for (int[] d : data) {
            if(d[extIdx] < val_ext){
                answer.add(d);
            }
        }
        answer.sort(Comparator.comparingInt(a -> a[sortIdx]));
        return answer.toArray(new int[answer.size()][]);
    }

    public static void main(String[] args) {
        int[][] answer = {{1, 20300104, 100, 80},
                {2, 20300804, 847, 37},{3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        int[][] solution = solution(answer, ext, val_ext, sort_by);
        for (int[] sol : solution) {
            System.out.println(Arrays.toString(sol));
        }

    }
}
