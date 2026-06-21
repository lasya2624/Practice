package list;

public class recursivesearch {
    
   static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        findsearc(head,10, 0);
    }
    static void findsearc(node head,int target,int idx){
        if(head == null){
            return;
        }
        if(head.data ==target){
            System.out.println("ele found at "+idx);
            return;
        }
        findsearc(head.next,target,idx+1);
    }
}
