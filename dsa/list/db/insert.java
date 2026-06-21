package list.db;

public class insert {
    node head;
    class node{
        int data;
        node prev;
        node next;
        node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
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
    public void insertAtLast(int data){
        node newnode = new node(data);
        if(head==null){
            head = newnode;
        }
        node ptr =head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next = newnode;
        newnode.prev=ptr;
    }
    public void insertAtMid(int data,int position){
        node newnode = new node(data);
        if(position<=1){
            head=newnode;
            head.next = newnode.next;
            head.next.prev = newnode;
            return;
        }
        node temp = head;
        int index=1;
        while(temp!=null){
            if(index==position-1){
                newnode.next = temp.next;
                newnode.prev = temp;
                temp.next = newnode;
            }
            temp=temp.next;
            index++;
        }
        if(temp==null){
            System.out.print(" list is out of bound ");
            return;
        }
    }
    public void print(){
        node poi = head;
        while(poi!=null){
            System.out.print(poi.data+"->");
            poi = poi.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        insert list = new insert();
        list.insertAtFirst(2);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtLast(8);
        list.insertAtMid(4,3);
        list.print();

    }
}
