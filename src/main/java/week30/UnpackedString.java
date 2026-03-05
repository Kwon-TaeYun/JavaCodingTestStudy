package week30;

import javax.print.attribute.standard.PrinterResolution;
import java.util.Stack;

public class UnpackedString {
    public String solution(String s){
        String answer = "";
        Stack<String> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if(x == ')'){
                String tmp = "";
                while(!st.empty()){
                    String c = st.pop();
                    if(c.equals("(")){
                        String num = "";
                        String res = "";
                        while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                            num = st.pop() + num;
                        }

                        int cnt = 0;
                        if(num.equals("")){
                            cnt = 1;
                        }else {
                            cnt = Integer.valueOf(num);
                            for (int i = 0; i < cnt; i++) {
                                res += tmp;
                            }
                        }
                        st.push(res);
                        break;
                    }

                    tmp = c + tmp;
                }


            }else{
                st.push(String.valueOf(x));
            }
        }
        for (String string : st) {
            answer += string;
        }

        return answer;
    }

    public static void main(String[] args){
        UnpackedString T = new UnpackedString();
        System.out.println(T.solution("3(a2(b))ef"));
        System.out.println(T.solution("2(ab)k3(bc)"));
        System.out.println(T.solution("2(ab3((cd)))"));
        System.out.println(T.solution("2(2(ab)3(2(ac)))"));
        System.out.println(T.solution("3(ab2(sg))"));
    }

}
