package tree;

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
public class SumOfNodes{
    static int count = 0;
    public static void sum(Node root){
        if(root == null){
            return;
        }
        count += root.data;
        // System.out.println(root.data);
        sum(root.left);
        sum(root.right);
        // System.out.println(count);
    }

    public static void main(String[] args){
        Node newnode = new Node(10);
        newnode.left = new Node(20);
        newnode.right = new Node(30);
        newnode.left.left = new Node(40);
        newnode.left.right = new Node(50);
        newnode.right.left = new Node(60);
        newnode.right.right = new Node(70);
        sum(newnode);
        // recursion(newnode);
        System.out.println(count);
    }
}
