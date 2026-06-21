package list;

 class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }

public class BinaryToInt {
    public static void main(String[] args) {
        node head = new node(1);
        head.next =new node(0);
        head.next.next =new node(1);
        head.next.next.next =new node(1);

        int decimal = 0;
        while(head!=null){
            decimal = decimal <<1 | head.data;//this add the bit to the decimal val after left shift
            head = head.next;
        }
        System.out.println(decimal);
    }
}