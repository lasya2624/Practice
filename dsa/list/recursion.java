package list;

class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next= null;
    }
}
public class recursion {
    public static void main(String[] args){
        node head = new node(10);
        node firstnode = new node(20);
        node secnode = new node(30);
        node trdnode = new node(40);

        head.next = firstnode;
        firstnode.next= secnode;
        secnode.next = trdnode;
        trdnode.next =null;
        
        printlist(head);
       // System.out.println(head.next.next.data);
       // instead of writing firstnode,secnode,trdnode we can also write head,head.next,head.next.next.... even then we can use recursion
       //instead of traversing through temp data we can use this
    }
    public static void printlist(node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printlist(root.next);
    }
}
