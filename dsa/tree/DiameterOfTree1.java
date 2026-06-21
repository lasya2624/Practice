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

public class DiameterOfTree1 {
    public static int diamter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diamter(root.left);//counts no.of nodes in left subtree // 2
        int diam2 = diamter(root.right);//counts no.of nodes in right subtree // 2 
        int diam3 = heightoftree(root.left) + heightoftree(root.right) + 1; // 5
        return Math.max(diam3, Math.max(diam1, diam2)); 
    }

    public static int heightoftree(Node root){
        if(root == null){
            return 0; 
        }
        int leftheight = heightoftree(root.left); // 2
        int rightheight = heightoftree(root.right); // 2
        return  Math.max(leftheight, rightheight)+1; // 3
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.left.left = new Node(40);
        head.left.right = new Node(50);
        head.right.left = new Node(60);
        head.right.right = new Node(70);
        System.out.println(diamter(head));

    }
}
