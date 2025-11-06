package week28;

import java.util.Scanner;

public class Password {
    public static String solution(int n, String s){
        String answer = "";
        s = s.replace('#', '1').replace('*', '0');
        for(int i = 0; i < n; i++){
            String tmp = s.substring(i*7, (i+1)*7);
            answer += (char) Integer.parseInt(tmp, 2);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next(); // ✅ next()로 변경 (공백문자 방지)
        System.out.println(solution(input1, input2));
    }
}
