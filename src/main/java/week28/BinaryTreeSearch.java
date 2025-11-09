package week28;
class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}


public class BinaryTreeSearch {
    Node root;
    public void DFS(Node root){//전위순회
        if(root == null) return;
        else{
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public void DFS1(Node root){//중위순회
        if(root == null) return;
        else{
            DFS1(root.lt);
            System.out.print(root.data + " ");
            DFS1(root.rt);
        }
    }

    public void DFS2(Node root){//중위순회
        if(root == null) return;
        else{
            DFS2(root.lt);
            DFS2(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeSearch tree = new BinaryTreeSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
        tree.DFS1(tree.root);
        tree.DFS2(tree.root);
    }
}
