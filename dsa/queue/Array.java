package queue;

public class Array {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}

class queue{
   // int [] arr = new int[5];
   int arr[];
   int n,size;
    int front =0,rear=-1;
    queue(){
        arr = new int[n];
        this.size = n;
    }
    void enqueue(int data){
        if(rear == size-1){
            return;
        }
        //this.rear++;
        arr[rear++]=data;
    }
    int dequeue(){
        if(isEmpty()){
            return -1;
        }
        // int top = this.front;
        // this.front++;  =>here we move front to front+1 i.e., front =1 basically front sould be 0 in every queue so we will write other method
        // return top;
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }
} 