package week27;

public class Dictionary {
    public static int solution(String word) {
        int answer = 0;
        char[] vowel = {'A','E','I','O','U'};
        int[] weight = {781, 156, 31, 6, 1};
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int idx = 0;
            for(int j = 0; j < vowel.length; j++){
                if(c == vowel[j]){
                    idx = j;
                    break;
                }
            }
            answer += idx * weight[i] + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AAAE"));
    }
}
