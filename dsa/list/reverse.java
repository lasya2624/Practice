package list;

public class reverse {
    public int size;
    node head;
    reverse(){
        this.size=0;
    }
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void assigning(){
        // do not repeatedly write node head it gives you error few times
        node firstnode= new node("hello");
        node secnode = new node("this is");
        node trdnode = new node("lasya");
        head=firstnode;
        firstnode.next=secnode;
        secnode.next=trdnode;
        trdnode.next=null;//in java it is not NULL it is null
    }
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void getsize(){
        System.out.println("size of the list is "+size);
    }
    public void reverse(){
        if(head==null||head.next==null){
            return;
        }
        node prev=null;
        node curr=head;
        while(curr!=null){
            node nextnode=curr.next;
            curr.next=prev;
            //update
            prev=curr;// 1 if we shift these two statements(1,2) up and down then u need to write head = temp after the loop instead head  = prev 
            curr=nextnode;//2
        }
        head.next=null;
        head=prev;
    }
    public static void main(String[] args) {
        reverse list = new reverse();
        list.assigning();
        list.getsize();
        list.reverse();
        list.print();
    }
}
