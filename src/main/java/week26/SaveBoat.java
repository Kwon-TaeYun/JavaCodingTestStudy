package week26;

import java.util.Arrays;

public class SaveBoat {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length -1;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
                right--;
            }else{
                right--;
            }
            answer++;
        }
        return answer;
    }

    //50 50 70 80

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        System.out.println(solution(people, 100));
    }
}
