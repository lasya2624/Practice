package list;

public class loopdetection {
    node head;
    node fnode;
    node snode;
    node tnode;
    node frnode;
    node fvnode;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void assign(){
        fnode=new node(2);
        snode=new node(3);
        tnode=new node(4);
        frnode=new node(5);
        fvnode=new node(6);
        head=fnode;
        fnode.next=snode;
        snode.next=tnode;
        tnode.next=frnode;
        frnode.next=fvnode;
        fvnode.next=null;
    }
    public void detectloop(){
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){// we will identify the loop only when slow==fast (exactly equals to )
                slow.next=null;//we will not print the elements  
                System.out.println("loop detected");
                return;
            }
        }

    }
    public void printlist(){
        node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    public void createloop(){
        node temp=head;
        while(temp!=null &&temp.next!=null){
            temp=temp.next;
        }
        temp.next=head.next;
    }
    public static void main(String [] args){
        loopdetection list = new loopdetection();
        list.assign();
        list.createloop();
        list.detectloop();
        list.printlist();
    }
}
