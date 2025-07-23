package week16;

public class NextOfNum {
    public static int solution(int[] common) {
        if(common[1] - common[0] == common[2] - common[1]){
            return common[common.length - 1] + (common[1] - common[0]);
        }else{
            return common[common.length - 1] * (common[1] / common[0]);
        }
    }

    public static void main(String[] args) {
        int[] common = {1, 2, 3, 4};
        System.out.println(solution(common));
    }
}
