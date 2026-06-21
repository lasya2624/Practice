package list;

public class findmid {
    public int size;
    node head;
    node firstnode;
    node secnode;
    node trdnode;
    node fournode;
    node fivenode;
    findmid(){
        this.size=0;
    }
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void creation(){
        firstnode=new node(2);
        secnode = new node(1);
        trdnode= new node(6);
        fournode= new node(7);
        fivenode = new node(9);
        head=firstnode;
        firstnode.next=secnode;
        secnode.next=trdnode;
        trdnode.next=fournode;
        fournode.next=fivenode;
        fivenode.next=null;
    }
    public void mid(){
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;//moves by one step
            fast=fast.next.next;//moves by two steps
        }
        System.out.println("mid element is :"+slow.data);
    }
    public static void main(String[] args){
        findmid list = new findmid();
        list.creation();
        list.mid();

    }
}
