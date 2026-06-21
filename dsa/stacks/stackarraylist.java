package stacks;
//implementing stack using arraylist
import java.util.ArrayList;

public class stackarraylist {
    public static void main(String[] args) {
        stack s = new stack();//here stack should be assistice like its in the class name
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.pop();
        s.pop();
    }
}
class stack{// class name
    ArrayList<Integer> list  =  new ArrayList<>();
    void push(int data){
        list.add(data);
    }
    void pop(){
        if(isEmpty()){
            return;
        }
        int last = list.get(list.size()-1);
        list.remove(list.size()-1);
        System.out.println(last);
    }
    boolean isEmpty(){
        if(list.size()==0){
            return true;
        }
        return false;
    }
}
