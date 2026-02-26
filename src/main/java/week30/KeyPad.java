package week30;

import java.util.ArrayList;
import java.util.List;
class Pad{
    int x;
    int y;
    Pad(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class KeyPad {
    public int solution(int[] keypad, String password){
        int answer = 0;
        List<Pad> pad = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < 10; i++){
            pad.add(new Pad(0,0));
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int num = keypad[idx];
                pad.set(num, new Pad(i,j));
                idx++;
            }
        }

//        for (Pad p : pad) {
//            System.out.println(p.x + " " + p.y);
//        }

        int prev = password.charAt(0) - '0';
        for(int i = 1; i < password.length(); i++){
            int now = password.charAt(i) - '0';
            int px = pad.get(prev).x;
            int py = pad.get(prev).y;
            int nx = pad.get(now).x;
            int ny = pad.get(now).y;
            int dx = Math.abs(px - nx);
            int dy = Math.abs(py - ny);

            answer += Math.max(dx , dy);

            prev = now;
        }



        return answer;
    }

    public static void main(String[] args){
        KeyPad T = new KeyPad();
        System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));
        System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
        System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
        System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
    }

}
