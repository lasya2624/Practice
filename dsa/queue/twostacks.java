package queue;
import java.util.*;

public class twostacks {
    public static void main(String[] args){
        queuee q = new queuee();
        q.push(5);
        q.push(6);
        q.push(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}
class queuee{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 =  new Stack<>();
    void push(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        return s1.pop();
    }
    int peek(){
        if(isEmpty()){
            System.out.println("stcak is empty");
            return -1;
        }
        return s1.peek();
    }
    boolean isEmpty(){
        return s1.isEmpty();
    }
}
