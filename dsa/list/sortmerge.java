package list;

public class sortmerge {
    node head1;
    node head2;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node sort(node head1, node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        node curr = new sortmerge().new node(-1); // Dummy node sortmerge is imp bcz -1 is the nergative 
        node temp = curr;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        return curr.next; // Fix: Correct return statement to avoid -1 we use from next 
    }

    public void print(node head) {
        node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        sortmerge list = new sortmerge();

        sortmerge.node head1 = list.new node(1);//sortmerge is needed cz its new node 
        head1.next = list.new node(3);
        head1.next.next = list.new node(8);

        sortmerge.node head2 = list.new node(5);
        head2.next = list.new node(4); // Fix: Insert 4 before 6
        head2.next.next = list.new node(6);

        System.out.println("Merged Sorted List:");
        node sorted = sort(head1, head2);
        list.print(sorted);
    }
}