package week24;
import java.util.ArrayDeque;
import java.util.Queue;

public class Cache {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) return cities.length * 5;
        Queue<String> queue = new ArrayDeque<>();
        for (String city : cities) {
            city = city.toLowerCase();
            if(queue.contains(city)){
                answer += 1;
                queue.remove(city);
            }else{
                answer += 5;
                if(queue.size() >= cacheSize){
                    queue.poll();
                }
            }
            queue.add(city);
//            System.out.println(queue);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] cities = {"a","b","a","c","d"};
        System.out.println(solution(3, cities));
    }
}
