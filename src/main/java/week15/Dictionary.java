package week15;

public class Dictionary {
    public static int solution(String[] spell, String[] dic) {
        for (String d : dic) {
            boolean canMake = true;
            for (String s : spell) {
                if (!d.contains(s)) {
                    canMake = false;
                    break;
                }
            }
            if (canMake && d.length() == spell.length) {
                return 1;
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell, dic));

    }
}
