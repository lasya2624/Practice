package tree;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BFS {

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode = q.remove();
            if(currnode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else {
                System.out.print(currnode.data + " ");
                if(currnode.left != null){
                    q.add(currnode.left);
                }
                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }

        }
    }
    public static void main(String[] args){
        Node newnode = new Node(10);
        newnode.left = new Node(20);
        newnode.right = new Node(30);
        newnode.left.left = new Node(40);
        newnode.left.right = new Node(50);
        newnode.right.left = new Node(60);
        // newnode.right.right = new Node(70);
        levelOrder(newnode);
    }
}
