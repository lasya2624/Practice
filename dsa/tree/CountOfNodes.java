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

public class CountOfNodes {
    //1st method
    // static int count = 0;
    // public static void count(Node root){
    //     if(root == null){
    //         return;
    //     }
    //     count++;
    //     count(root.left);
    //     count(root.right);
    // }


    //2nd method
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return leftHeight + rightHeight + 1;

    }

    public static void main(String[] args) {
        Node newnode = new Node(10);
        newnode.left = new Node(20);
        newnode.right = new Node(30);
        newnode.left.left = new Node(40);
        newnode.left.right = new Node(50);
        newnode.right.left = new Node(60);
        newnode.right.right = new Node(70);
        
        //1st method
        // count(newnode);
        // System.out.println(count);
        
        //2nd method
        System.out.println(height(newnode));
    }
}
