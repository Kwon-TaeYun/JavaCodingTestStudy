package week14;

public class NearestNum {
    public static int solution(int[] array, int n) {
        int answer = array[0];
        int minDIff = Math.abs(array[0] - n);

        for(int i = 1; i < array.length; i++){
            int diff = Math.abs(array[i] - n);
            if(diff < minDIff){
                answer = array[i];
                minDIff = diff;
            }else if(diff == minDIff){
                answer = Math.min(array[i], answer);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        int solution = solution(array, n);
        System.out.println(solution);
    }
}
