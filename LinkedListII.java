import java.util.*;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
    }
}
public class LinkedListII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ListNode head = new ListNode(0);
        for(int i=0;i<n;i++){
            ListNode newnode = new ListNode(sc.nextInt());
            head.next = newnode;
            
        }

    }
}
