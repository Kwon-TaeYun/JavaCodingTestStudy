package week24;

public class MaxAndMin {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] token = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String t : token) {
            int i = Integer.parseInt(t);
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        sb.append(min);
        sb.append(" ");
        sb.append(max);

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
