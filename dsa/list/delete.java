package list;

public class delete {
    node head;
    public int size;// we can also keep private
    delete(){
        this.size=0;
    }
    class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //insertion at starting
    public void addfirst(int data){
        node newnode=new node(data);

        newnode.next=head;
        head=newnode;
    }
    //deletion at first
    public void dltfirst(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //deletion at last and assigning as null
    public void dltlast(){
        node ptr =head;
        if(ptr==null){
            System.out.print("list is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        node firstnode=head;
        node secondnode=head.next;
        while(secondnode.next!=null){
            firstnode=firstnode.next;
            secondnode=secondnode.next;
        }
        firstnode.next=null;
    }
    //deletion at mid
    public void dltmid(int index){
        int count = 0;
        node ptr = head;
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
       }

    if (index == 0) {
        head = head.next;
    } else {
        for (int i = 0; i <= index-1 ; i++) {
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
    }

    size--;
    }
    //printing the list
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
    public void getsize(){
        System.out.println("\n size of the list is"+size);
    }
    //removing the nth idx from the last in the list 
    public void dltrandom(int idx){
        int len = size;
        int length = len -idx-1;//this defines the idx number from first
      if(length<0 || length>=size){
        System.out.println("invalid index");
      }
      node ptr = head;
      if(length ==0){
        head = head.next;
      }
      else{
        for(int i=0;i<length-1;i++){
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
      }
      size--;
      

    }
    public static void main(String[] args){
        delete dl=new delete();
         dl.addfirst(50);
        dl.addfirst(40);
        dl.addfirst(30);
        dl.addfirst(20);
        dl.addfirst(10);
        //dl.dltmid(2);
        dl.dltrandom(2);//dlt from last
        //dl.dltfirst();
        dl.print();
        dl.getsize();
    }
}
