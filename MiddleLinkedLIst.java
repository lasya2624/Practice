import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class MiddleLinkedLIst {
    public static ListNode creatList(int[] arr){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for(int data :arr){
            tail.next = new ListNode(data);
            tail = tail.next;
        }
        return dummy.next;
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ListNode curr = creatList(arr);
        ListNode result = middleNode(curr);

        // System.out.println(result.val+" ");
        ListNode temp = result;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        

    }
}
