package stacks;
public class stacklinkedlist {
    static class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
static class stack{
    public  node head;
    public  boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void push(int data){
        node newNode = new node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public int  pop(){
        
        if(isEmpty()){
            System.out.println("stack is sempty");
            return -1;
        }
        int top =head.data;
        head = head.next;
        return top;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return head.data;
    }
}
    public static void main(String[] args){
        stack s = new stack();
       //Stack<Integer> s = new Stack<Integer>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}

