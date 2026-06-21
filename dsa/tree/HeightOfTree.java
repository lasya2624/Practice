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

public class HeightOfTree {
    public static void main(String[] args){
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.left.left = new Node(40);
        head.left.right = new Node(50);
        head.right.left = new Node(60);
        head.right.right = new Node(70);
        // head.left.left.left = new Node(80);
        // head.left.left.right = new Node(90);

        // recursion(head);
        System.out.println(heightoftree(head));
    }

    // public static void recursion(node root){
    //     if(root == null){
    //         return;
    //     }
    //     //preorder traversal
    //     System.out.println(root.data);
    //     recursion(root.left);
    //     recursion(root.right);
    // }

public static int heightoftree(Node root){
    if(root == null){
        return 0; 
    }
    int leftheight = heightoftree(root.left);
    int rightheight = heightoftree(root.right);
    return  Math.max(leftheight, rightheight)+1;
}

}