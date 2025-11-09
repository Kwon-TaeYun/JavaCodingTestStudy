package week28;

import java.util.LinkedList;
import java.util.Queue;

public class Shortestpath {
    Node root;
    public int DFS(int L, Node pos){
        if(pos.lt == null && pos.rt == null) return L;
        else return Math.min(DFS(L+1, pos.lt), DFS(L+1, pos.rt));
    }

    public int BFS(Node root){//전위순회
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                Node cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null){
                    Q.offer(cur.lt);
                }
                if(cur.rt != null){
                    Q.offer(cur.rt);
                }
            }
            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Shortestpath tree = new Shortestpath();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
        int bfs = tree.BFS(tree.root);
        System.out.println(bfs);
    }
}
