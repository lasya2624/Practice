package list;

public class insert {
    node head;

    private int size;
    insert()
    {
        this.size=0;
    }
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //creation of nodes
    node firstnode;
    node secnode;
    node trdnode;
    public void assign(){
        firstnode = new node(2);
        secnode = new node(1);
        trdnode = new node(3);
        firstnode.next = secnode;
        secnode.next = trdnode;
        trdnode.next = null;
        head=firstnode;
    }
    
    //insert at the middle
    public void insertatmid(int data){
            node slow=head;
            node fast=head;
            node prev=null;

            while(fast!=null && fast.next!=null){
                prev=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            node newnode = new node(data);
            //size++; no need to increase size bcz it automatically creates a newnode and attaches it
            if(prev!=null){
                newnode.next=slow.next;//this makes 1->2->data->3->null
                slow.next=newnode;//this makes slow.next that is 2.next = data
            }
    }
    
    //printing the list
    public void print(){
        if(head==null){
            System.out.println("list is empty");// here null needs to be wriiten not Null
            return;
        }
        node tempnode=head;
        while(tempnode!=null){
            System.out.print(tempnode.data+"->");
            tempnode=tempnode.next;
        }
        System.out.print("NULL");
    }


    //returning the size
    public void  getsize(){
        System.out.println("\n size of the list is "+size);
    }
    public static void main(String[] args){
        insert list = new insert();
        list.assign();
        list.insertatmid(2);
        list.insertatmid(6);
        list.print();
        list.getsize();
    }
}
