package week21;

public class DoubleColoring {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int location = 0;
        for(int i = 0; i < section.length; i++){
            if(location < section[i]){
                answer++;
                location = section[i] + m - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] section = {2,3,6};
        int solution = solution(8, 4, section);
        System.out.println(solution);
    }
}
