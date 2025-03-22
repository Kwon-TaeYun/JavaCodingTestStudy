package week07.베스트앨범;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BestAlbum {
    public static int[] solution(String[] genres, int[] plays) {
        List<Integer>answer = new ArrayList<>();
        HashMap<String, Integer> genresFirst = new HashMap<>(); //[장르, 재생횟수 다 더한거]
        HashMap<String, List<int[]>> playsFirst = new HashMap<>(); //{장르, [인덱스, 재생횟수],[인덱스, 재생횟수],[인덱스, 재생횟수]}

        for(int i = 0; i < genres.length; i++){
            genresFirst.put(genres[i], genresFirst.getOrDefault(genres[i], 0) + plays[i]);
            playsFirst.putIfAbsent(genres[i], new ArrayList<>());//putIfAbsent 처음 발견 !!
            playsFirst.get(genres[i]).add(new int[]{i, plays[i]});
        }

        List<String> genresKeySet = new ArrayList<>(genresFirst.keySet());
        genresKeySet.sort((a, b) -> genresFirst.get(b) - genresFirst.get(a));
//        System.out.println(genresKeySet);

        for (String g : genresKeySet) {
            ArrayList<int[]> genreArray = new ArrayList<>(playsFirst.get(g));
            genreArray.sort((a,b)->a[1]==b[1]?a[0]-b[0] : b[1]-a[1]);
            for(int i = 0; i < Math.min(2, genreArray.size()); i++){
                answer.add(genreArray.get(i)[0]);
            }
        }



        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] output = solution(genres, plays);
        System.out.println(Arrays.toString(output));
    }
}
