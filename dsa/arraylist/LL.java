package arraylist;

import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(3);
        //list.remove(3);
        //list.addFirst(1);
        //list.addLast(6);
        //list.get(0);
        //list.set(0, 10);
        //list.clear(); //clears the whole list
        //list.clone();//clone() returns a new list object with the same elements as the original list.
        list.add(1,2);
        List<Integer> sub = list.subList(1,3);
        System.out.println(sub);
        System.out.println(list);
        System.out.println(list.size());
    }
}