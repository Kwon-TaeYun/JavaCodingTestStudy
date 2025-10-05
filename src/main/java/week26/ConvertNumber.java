package week26;


import java.util.*;

public class ConvertNumber {
    public int solution(int x, int y, int n) {
        Queue<long[]> queue = new LinkedList<>();
        Set<Long> visited = new HashSet<>();
        queue.add(new long[]{x, 0});
        Map<Integer, Integer> map = new HashMap<>();
        while(!queue.isEmpty()){
            long[] list = queue.poll();
            long value = list[0];
            long count = list[1];
            if(value == y) return (int)count;
//            if(value > y) continue;
//
//            queue.add(new long[]{value+n, count+1});
//            queue.add(new long[]{value * 2, count + 1});
//            queue.add(new long[]{value * 3, count + 1});

            long[] next = {value + n, value * 2, value * 3};
            for (long v : next) {
                if(v <= y && !visited.contains(v)){
                    queue.add(new long[]{v, count + 1});
                    visited.add(v);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
