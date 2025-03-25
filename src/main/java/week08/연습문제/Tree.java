package week08.연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    public static String[] solution(Integer[] nodes){
        List<String> answer = new ArrayList<>();
        String preorder = preorder(nodes, 0);
        String inorder = inorder(nodes, 0);
        String postOrder = postOrder(nodes, 0);

        answer.add(preorder);
        answer.add(inorder);
        answer.add(postOrder);

        return answer.toArray(new String[0]);
    }
    public static String preorder(Integer[] nodes, int index){
        if(index >= nodes.length){
            return "";
        }
        return nodes[index] +" " +preorder(nodes, 2*index+1) + preorder(nodes, index*2 + 2);
    } //1 2 4 5 3 6 7

    public static String inorder(Integer[] nodes, int index){
        if(index >= nodes.length){
            return "";
        }
        return inorder(nodes,index*2+1) +nodes[index] +" " +inorder(nodes, index*2+2);


    }          // 4  2 5 1 6 3 7

    public static String postOrder(Integer[] nodes, int index){
        if(index >= nodes.length){
            return "";
        }
        return postOrder(nodes, index*2+1) + postOrder(nodes, index*2+2) + nodes[index] + " ";

    }
    //4   5   2   6 7  3             1

    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5,6,7};
        String[] output = solution(input);
        System.out.println(Arrays.toString(output));

    }
}

