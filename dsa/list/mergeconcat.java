package list;

public class mergeconcat {
    node head1;
    node head2;
    node firstnode;
    node secnode;
    node trdnode;
    node frnode;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void assigning1(){
        firstnode = new node(5);
        secnode = new node(6);
        trdnode = new node(8);
        frnode = new node(9);
        head1=firstnode;
        firstnode.next=secnode;
        secnode.next = trdnode;
        trdnode.next = frnode;
        frnode.next = null;
    }
    public void assigning2(){
        firstnode = new node(1);
        secnode = new node(2);
        trdnode = new node(3);
        frnode = new node(4);
        head2=firstnode;
        firstnode.next=secnode;
        secnode.next = trdnode;
        trdnode.next = frnode;
        frnode.next = null;
    }
    public static node merge(node head1,node head2){// need to write static node not void 
        if(head1==null){
            return head2;
        }
        if(head2==null){
           return head1;
        }
        node ptr = head1;
        while(ptr.next!=null){// when you writr ptr as not null then it will go to null and then checks whether it is null or not
            ptr=ptr.next;//if it is null then it cant provide next to it so we search bfore as ptr.next
        }
        ptr.next=head2;

        return head1;
    }
    public void print(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        mergeconcat list = new mergeconcat();
        list.assigning1();
        list.assigning2();
        node merged = merge(list.head2,list.head1);// we need to write list.head1 not head1 directly 
        list.print(merged);
    }
}