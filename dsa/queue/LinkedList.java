package queue;

public class LinkedList {
    public static void main(String[] args){
        queueue q = new queueue();
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
class queueue{
    node head;
    node tail;
    int front, rear;
    void add(int data){
        node newnode = new node(data);
        if(isEmpty()){
            tail = head = newnode;
            front = rear = tail.data;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        rear = tail.data;
    }
    int remove(){
        if(isEmpty()){
            return -1;
        }
        if(head == tail){
            head = tail = null;
        }
        front = head.data;
        head = head.next;
        return front;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        return front;
    }
    boolean isEmpty(){
        if(head == null & tail == null){
            return true;
        }
        return false;
    }
}