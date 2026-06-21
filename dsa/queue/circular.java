package queue;

public class circular{
    public static void main(String[] args){
        queueu q = new queueu();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(7);
        q.enqueue(2);
        // System.out.println(q.dequeue());

        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.dequeue();
        // }
    }
}


class queueu{
    int size= 5;
    int arr[] = new int[size];
    int front=-1;
    int rear =-1;
    void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        if(isEmpty()){
            front =0;
            rear = 0;
        }else{
            rear =(rear+1)%size;
        }
        arr[rear]=data;
    }
    int dequeue(){
        if(isEmpty()){
            return -1;
        }
        
        int top = arr[front];
        if (front == rear) {
            // Only one element
            front = rear = -1;
        }else{
            front  = (front+1)%size;
        }
        return top;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if((rear+1)%size == front ){
            return true;
        }
        return false;
    }
}