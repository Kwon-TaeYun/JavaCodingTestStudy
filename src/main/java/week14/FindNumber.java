package week14;

public class FindNumber {
    public int solution(int num, int k) {
        int answer = 0;
        String[] numArray = String.valueOf(num).split("");
        String kString = String.valueOf(k);
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i].equals(kString)){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
