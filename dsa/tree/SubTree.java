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

public class SubTree {

    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        } 
        else if(subroot == null){
            return true;
        } 
        else {
            if(root.data == subroot.data){
                if(root.left.data == subroot.left.data && root.right.data == subroot.right.data){
                    return true;
                }
            }
            isSubtree(root.left,subroot);
            isSubtree(root.right,subroot);
            return false;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.left.left = new Node(40);
        head.left.right = new Node(50);
        head.right.left = new Node(60);
        head.right.right = new Node(70);
        head.left.left.left = new Node(80);
        head.left.left.right = new Node(90);

        Node newnode = new Node(1);
        newnode.left = new Node(2);
        newnode.right = new Node(3);

        System.out.println(isSubtree(head, newnode));

    }
}
