package stacks;
import java.util.*;

public class pushAtBottom {
    public static void pushAtBot(int data,Stack<Integer> s){//here static keyword is neccessary
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBot(data,s);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(3);
        s.push(6);
        pushAtBot(1,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
