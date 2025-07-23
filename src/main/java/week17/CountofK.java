package week17;

public class CountofK {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        String target = String.valueOf(k);
        for(int o = i; o <= j; o++){
            String s = String.valueOf(o);
            for(int idx = 0; idx < s.length(); idx++){
                if(String.valueOf(s.charAt(idx)).equals(target)){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i, j, k));

    }
}
