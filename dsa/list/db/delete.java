package list.db;

public class delete {
    node head;
    class node{
        int data;
        node prev;
        node next;
        node(int data){
            this.data=data;
            this.next = null;
            this.prev=null;
        }
    }
    public void insertAtFirst(int data){
        node newnode = new node(data);
        if(head!=null){
            head.prev=newnode;
            newnode.next = head;
        }
        head = newnode;
    }
    public void deleteAtMid(int data){
        node slow = head;
        node fast =head.next;
        while(fast!=null){
            if(data == fast.data){
                slow.next = fast.next;
                fast.next.prev = slow;
            }
            slow=slow.next;
            fast=fast.next;
        }
    }
    public void deleteAtFirst(){
        if(head==null){
            System.out.print("list is already empty");
            return;
        }
        head=head.next;
    }
    public void deleteAtLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next =null;
    }
    public void print(){
        node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        delete list = new delete();
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);
        list.insertAtFirst(8);
        list.deleteAtMid(7);
        //list.deleteAtFirst();
        list.deleteAtLast();
        list.print();
    }
}