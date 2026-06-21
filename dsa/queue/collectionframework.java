package queue;
import java.util.ArrayDeque;
import java.util.Queue;

public class collectionframework {
    public static void main(String[] args) {
        Queue<Integer>  q = new ArrayDeque<>();//instead linkedlist we can use arraydeque for faster queue operations
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }   
}