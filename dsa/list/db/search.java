package list.db;

public class search {
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
    public void creation(){
        node fnode=new node(5);
        node secnode=new node(6);
        node tnode=new node(3);
        head=fnode;
        fnode.next=secnode;
        secnode.next=tnode;
        tnode.next=null;
        secnode.prev=fnode;
        tnode.prev=secnode;
    }
    public void se(int data){
        node ptr= head;
        int index=0;
        while(ptr!=null){
            if(ptr.data==data){
                System.out.println("element found at index"+index);
                return;
            }
            ptr=ptr.next;
            index++;
        }
        System.out.println("list is empty");
    }
    public static void main(String[] args){
        search list = new search();
        list.creation();
        list.se(3);
    }
}