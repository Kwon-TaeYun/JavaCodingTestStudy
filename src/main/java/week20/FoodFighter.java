package week20;

public class FoodFighter {
    public static String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            System.out.println(food[i] / 2);
            for(int j = 0; j < food[i]/2; j++){
                answer += i;
            }
        }
        answer += '0';
        for(int i = food.length - 1; i >= 1; i--){
            for(int j = 0; j < food[i]/2; j++){
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        String solution = solution(food);
        System.out.println(solution);
    }
}
