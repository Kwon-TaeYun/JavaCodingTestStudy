package week26;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    public static int solution(String numbers) {
        int answer = 0;
        visited = new boolean[numbers.length()]; //2개 칸
        permution(numbers.toCharArray(), "");
        for (Integer n : set) {
            if(isPrime(n)) answer++;
        }
        return answer;
    }

    public static void permution(char[] nums, String current){
        if(!current.equals("")){
            set.add(Integer.parseInt(current));
        }

        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                permution(nums, current + nums[i]);
                visited[i] = false;
            }
        }
    }

    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        String numbers = "17";
        System.out.println(solution(numbers));
    }
}
