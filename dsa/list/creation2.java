package list;

public class creation2 {
    node head;
    node firstnode;
    node secnode;
    node trdnode;
    class node{
        int data;
        node next;
        node (int data){
            this.data=data;
            this.next=null;
        }
    }
    
    //assigning nodes
    public void creation(){
        firstnode=new node(2);
        secnode = new node(1);
        trdnode= new node(6);
        head=firstnode;
        firstnode.next=secnode;
        secnode.next=trdnode;
        trdnode.next=null;
    }

    //deletion at the middle
    public void dltmiddle(){
        node slow=head;//assigning head as slow
        node fast=head;//assigning fast as head
        node prev=null;//assigning prev as null
        while(fast!=null&fast.next!=null){
            prev=slow;//we assign head to prev
            slow=slow.next;// now we increment slow after assigning for prev to firstnode
            fast=fast.next.next;//now fast will be secnode and the slow will stay at the middle
        }
        if(prev!=null){
            prev.next=slow.next;//now head.next =slow.next that is head.next=firstnode will be equivalent to 
        }//slow.next=secnode
    }

    //printing the list
    public void print(){
        if (head==null){
            System.out.print("list is empty");
        }
        node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args){
        creation2 list = new creation2();
        list.creation();
        list.dltmiddle();
        list.print();
    }
}