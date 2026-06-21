package list;

public class search {
    public int size;
    node head;
    search(){
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
    public void getsize(){
        System.out.println("size of the list is "+size);
    }
    public void searching(String search){
        node ptr = head;
        int index=0;
        while(ptr!=null){
            if(ptr.data.equals(search)){
                System.out.println("element is found at index "+index);
                return;
            }
            ptr=ptr.next;
            index++;
        }
        System.out.println("element not found");
    }
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        search list = new search();
        list.assigning();
        list.searching("lasya");
        list.getsize();
    }
}