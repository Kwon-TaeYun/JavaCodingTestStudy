package week11;

//DFS 문제 Lv.2
public class TargetNumber {
    public static int dfs(int[] numbers, int index, int target, int result){
        if(index == numbers.length){
            if(result == target) {
                return 1;
            }else{
                return 0;
            }
        }

        int ans1 = dfs(numbers, index + 1, target, result + numbers[index]);
        int ans2 = dfs(numbers, index + 1, target, result - numbers[index]);

        return ans1 + ans2;
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        return dfs(numbers, 0, target, 0);
    }


    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        int answer = solution(numbers, target);

        System.out.println("answer:::" + answer);

    }
    //
    // 1 -> 1  -> 1
    //   -> -1
    //
}
