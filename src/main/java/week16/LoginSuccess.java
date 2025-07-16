package week16;

public class LoginSuccess {
    public static String solution(String[] id_pw, String[][] db) {
        for(int i = 0; i < db.length; i++){
            if(id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }

    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
        String solution = solution(id_pw, db);
        System.out.println(solution);
    }
}
