package week22;

import java.util.Stack;

public class MakeHamburger {
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> hamburger = new Stack<>();
        for (int ing : ingredient) {
            hamburger.push(ing);
            if(hamburger.size() >= 4){
                if(hamburger.get(hamburger.size() - 1) == 1 &&
                        hamburger.get(hamburger.size() - 2) == 3 &&
                hamburger.get(hamburger.size() - 3) == 2 &&
                hamburger.get(hamburger.size() - 4) == 1){
                    for (int i = 0; i < 4; i++){
                        hamburger.pop();
                    }
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredient));
    }
}
