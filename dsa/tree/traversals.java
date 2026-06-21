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
public class traversals {
    
    public static void main(String[] args) {
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.left.left = new Node(40);
        head.left.right = new Node(50);
        head.right.left = new Node(60);
        head.right.right = new Node(70);
        recursion(head);
    }
    public static void recursion(Node root){
        if(root == null){
            return;
        }
        //preorder traversal 
        System.out.println(root.data);
        recursion(root.left);
        recursion(root.right);

        // //postorder traversal 
        // recursion(root.left);
        // recursion(root.right);
        // System.out.println(root.data);

        // //inorder traversal 
        // recursion(root.left);
        // System.out.println(root.data);
        // recursion(root.right);
    }
}
            //         10
            //        /  \
            //      20    30
            //     /  \   /  \
            //    40  50 60  70 