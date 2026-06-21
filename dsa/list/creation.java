package list;

public class creation {
    node head;
    class node{
        String data;
        node next;

        node(String data){
            this.data=data;
            this.next=null;//this is the structure of linked list in java
        }
    }
    public void addfirst(String data){
        node newnode=new node(data);

        newnode.next=head;
        head=newnode;
    }
    public void addlast(String data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    public void printlist(){
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
    public static void main(String[] args) {
        creation list=new creation();
        list.addfirst("is");
        list.addfirst("she");
        list.addlast("lasya");
        list.printlist();
    }
}