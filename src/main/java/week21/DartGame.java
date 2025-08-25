package week21;

import java.util.Arrays;

public class DartGame {
    public static int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int idx = -1; //score의 인덱스

        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)){
                idx++;
                if(c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i+1) == '0'){
                    score[idx] = 10; //10점
                    i++; // 10에서 0 스킵
                }else{
                    score[idx] = c - '0';
                } // 0 ~ 9점
            }
            else if(c == 'S'){
                score[idx] = (int)Math.pow(score[idx],1);
            }
            else if(c == 'D'){
                score[idx] = (int)Math.pow(score[idx],2);
            }
            else if(c == 'T'){
                score[idx] = (int)Math.pow(score[idx],3);
            }
            else if(c == '*'){
                score[idx] *= 2;
                if(idx > 0){
                    score[idx - 1] *= 2;
                }
            }
            else if(c == '#'){
                score[idx] *= -1;

            }
        }
//        System.out.println(Arrays.toString(score));
        for(int i = 0; i < score.length; i++){
            answer += score[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String dartResult = "1D#2S*3S";
        System.out.println(solution(dartResult));
    }
}
