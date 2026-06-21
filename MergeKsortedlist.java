import java.util.*;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
    }
}
public class MergeKsortedlist{

    public static ListNode createListNode(Scanner sc, int size){

        ListNode dummy = new ListNode(0);
        ListNode tail= dummy;

        for(int i=0;i<size;i++){
            tail.next = new ListNode(sc.nextInt());
            tail= tail.next;
        }

        return dummy.next;
        
    }

    public static ListNode mergekListNode(ListNode[] lists){
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b) -> a.data - b.data
        );


        for(ListNode list : lists){
            if(list != null){
                pq.add(list);

            }
        }

        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(!pq.isEmpty()){
            ListNode val = pq.poll();
            tail.next = val;
            tail= tail.next;

            if(val.next!=null){
                pq.add(val.next);
            }
        }
        return dummy.next;

    }
    public static void printListNode(ListNode head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ListNode[] list = new ListNode[n];

        for(int i=0;i<n;i++){
            int size = sc.nextInt();
            list[i] = createListNode(sc, size);
        }
        ListNode merge = mergekListNode(list);

       printListNode(merge);
    }
}