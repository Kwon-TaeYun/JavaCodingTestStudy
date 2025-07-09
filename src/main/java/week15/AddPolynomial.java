package week15;

import java.util.Arrays;

public class AddPolynomial {
    public static String solution(String polynomial) {
        String answer = "";
        int xValue = 0;
        int constantValue = 0;
        String[] token = polynomial.split(" \\+ ");
//        System.out.println(Arrays.toString(token));
        for (String t : token) {
            if(t.contains("x")){
                if(t.equals("x")){
                    xValue += 1;
                }else{
                    xValue += Integer.parseInt(t.replace("x", ""));
                }
            }else{
                constantValue += Integer.parseInt(t);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (xValue != 0) {
            if (xValue == 1) {
                sb.append("x");
            } else {
                sb.append(xValue).append("x");
            }
        }

        if (constantValue != 0) {
            if (xValue != 0) {
                sb.append(" + ");
            }
            sb.append(constantValue);
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        System.out.println(solution(polynomial));
    }
}
