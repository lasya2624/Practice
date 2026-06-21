package queue;
import java.util.*;
public class Arraylist {
    public static void main(String[] args){
        queue q = new queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
class queue{
    ArrayList<Integer> list = new ArrayList<>();
    void enqueue(int data){
        list.add(data);
    }
    int dequeue(){
        if(list.isEmpty()){
            return -1;
        }
        int top = list.get(0);
        list.remove(0);
        return top;
    }
    boolean isEmpty(){
        if(list.size()==0){
            return true;
        }
        return false;
    }
}