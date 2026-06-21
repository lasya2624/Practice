package stacks;
import java.util.Stack;
public class juststack {
    public static void main(String[] args){
        Stack<Integer> s =new Stack<>();
        s.push(2);
        s.push(5);
        s.push(6);
        System.out.println(s.pop());
    }
}
