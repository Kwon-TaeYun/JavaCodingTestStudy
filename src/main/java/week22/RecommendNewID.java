package week22;

public class RecommendNewID {
    public static String solution(String new_id) {
        String answer = "";
        String id = "-_.";
        if(isValidId(new_id)){
            return new_id;
        }else{
            new_id = new_id.toLowerCase(); //1단계
            new_id = new_id.replaceAll("[^a-z0-9._-]", ""); //2단계
            new_id = new_id.replaceAll("\\.{2,}", "."); //3단계
            if(new_id.startsWith(".")){
                new_id = new_id.substring(1);
            }
            if(new_id.endsWith(".")){
                new_id = new_id.substring(0, new_id.length() - 1);
            } //4단계
            if(new_id.equals("")){
                new_id = "a";
            } //5단계
            if(new_id.length() >= 16){
                new_id = new_id.substring(0, 15);
            }
            if(new_id.endsWith(".")){
                new_id = new_id.substring(0, new_id.length() - 1);
            }//6단계
            if(new_id.length() <= 2){
                while(new_id.length() < 3){
                    new_id += new_id.charAt(new_id.length() - 1);
                }
            }
        }

        return new_id;
    }

    public static boolean isValidId(String id) {
        // 1. 길이 체크
        if (id.length() < 3 || id.length() > 15) {
            return false;
        }

        // 2. 허용 문자 체크 (정규식)
        if (!id.matches("[a-z0-9._-]+")) {
            return false;
        }

        // 3. 마침표 관련 규칙 체크
        if (id.startsWith(".") || id.endsWith(".")) {
            return false;
        }

        if (id.contains("..")) { // 연속 마침표
            return false;
        }

        return true; // 모든 조건 통과
    }

    public static void main(String[] args) {
        String solution = solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println(solution);
    }
}
