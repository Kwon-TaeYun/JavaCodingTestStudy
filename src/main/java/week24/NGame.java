package week24;

public class NGame {
    public static String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while(sb.length() < m * t){
            sb.append(Integer.toString(num++, n).toUpperCase());
        }
//        System.out.println(sb);
        for(int i = p - 1; i < m * t; i+=m){
            answer.append(sb.charAt(i));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(16,16,2,1));
    }
}
