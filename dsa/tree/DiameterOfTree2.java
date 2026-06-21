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
class Tree{
    int diam;
    int heit;
    Tree(int diam, int heit){
        this.diam = diam;
        this.heit = heit;
    }
}

public class DiameterOfTree2 {

    public static Tree diameter(Node root){
        if(root == null){
            return new Tree(0,0);
        }
        Tree left = diameter(root.left);
        Tree right = diameter(root.right);

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.heit + right.heit + 1;

        int myHeight = Math.max(left.heit , right.heit) + 1;
        int myDiam = Math.max(diam3, Math.max(diam1,diam2));

        Tree myInfo = new Tree(myDiam, myHeight);
        return myInfo;

    }
    public static void main(String[] args){
        Node newnode = new Node(10);
        newnode.left = new Node(20);
        newnode.right = new Node(30);
        newnode.left.left = new Node(40);
        newnode.left.right = new Node(50);
        newnode.right.left = new Node(60);
        newnode.right.right = new Node(70);

        System.out.println(diameter(newnode).diam);
    }
}