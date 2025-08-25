package week21;

public class NumberCouple {
    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] Xcount = new int[10];
        int[] Ycount = new int[10];
        for (char c : X.toCharArray()) {
            Xcount[c - '0'] ++;
        }

        for (char c : Y.toCharArray()) {
            Ycount[c - '0'] ++;
        }

        for(int i = Xcount.length-1; i >= 0; i--){
            int common = Math.min(Xcount[i], Ycount[i]);
            for(int j = 0; j < common; j++){
                answer.append(i);
            }
        }
        if(answer.length() == 0) return "-1";
        if(answer.charAt(0) == '0') return "0";
        return answer.toString();
    }

    public static void main(String[] args) {
        String X = "12321";
        String Y = "42531";
        System.out.println(solution(X,Y));
    }
}
