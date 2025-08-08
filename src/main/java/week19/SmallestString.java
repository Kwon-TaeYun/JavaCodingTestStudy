package week19;

public class SmallestString {
    public static int solution(String t, String p) {
        int answer = 0;
        String s = "";
        for(int i = 0; i < t.length() - p.length() + 1; i++){
            for(int j = i; j < i + p.length(); j++) {
                s += t.charAt(j);
            }
            if(Long.parseLong(s) <= Long.parseLong(p)){
                answer++;
            }
            s = "";
        }
        return answer;
    }

    public static void main(String[] args) {
        String t = "3141592"; // 7
        String p = "271"; // 3
        System.out.println(solution(t, p));
    }
}
