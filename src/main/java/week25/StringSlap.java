package week25;

public class StringSlap {
    public static int solution(String s) {
        int n = s.length();
        int answer = n;

        for(int unit = 1; unit <= n/2; unit++){
            StringBuilder sb = new StringBuilder();
            String prev = s.substring(0, unit); //a
            int count = 1;
            for(int i = unit; i < n; i+= unit){
                String cur = s.substring(i, Math.min(n, i+unit));
                if(prev.equals(cur)){
                    count++;
                }else{
                    if(count > 1) {
                        sb.append(count);
                    }
                    sb.append(prev);
                    prev = cur;
                    count = 1;
                }
            }

            if(count > 1) {
                sb.append(count);
            }
            sb.append(prev);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aabbaccc"));
    }
}
