package week22;

public class CarryBox {
    public static int solution(int n, int w, int num) {
        int allFloor = n / w; //0부터 시작
        int col = 0;
        if(allFloor % 2 == 1){
            col = w - (n % w); //왼쪽부터 0
        }else{
            col = n % w;
        }

        return allFloor;
    }

    public static void main(String[] args) {
        int n = 13;
        int w = 3;
        int num = 6;
        System.out.println(solution(n,w,num));
    }
}
