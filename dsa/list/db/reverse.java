package list.db;

public class reverse {
    node head;
    node tail;
    class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
     public void insertAtFirst(int data){
        node newnode = new node(data);
        if(head!=null){
            head.prev=newnode;
            newnode.next = head;
        }
        head = tail = newnode;
        
    }
    public void print(){
        node poi = head;
        while(poi!=null){
            System.out.print(poi.data+"->");
            poi = poi.next;
        }

        System.out.println("NULL");
    }
    public void reverse(){
        node current = head;
        node temp = null;

    // Swap next and prev for each node
    while (current != null) {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;  // move to "next" node, which is actually prev now// you are just doing like swapping 2 num's by extra variable
    }

    // After the loop, temp is at the second-to-last node processed
    if (temp != null) {
        head = temp.prev;
    }

    // Update tail by walking to end
    tail = head;
    while (tail != null && tail.next != null) {
        tail = tail.next;
    }
    }

    public static void main(String[] args) {
        reverse list = new reverse();
        list.insertAtFirst(2);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(8);
        list.print();
        list.reverse();
        list.print();
    }
}