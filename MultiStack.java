import java.util.*;

class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if (s2.isEmpty() || val <= s2.peek()) {
            s2.push(val);
        }
    }
    
    public void pop() {
        if (s1.peek().equals(s2.peek())) {
            s2.pop();
        }
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

public class MultiStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack obj = new MinStack();

        int n = sc.nextInt(); // number of operations

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            switch (op) {
                case "push":
                    int val = sc.nextInt();
                    obj.push(val);
                    break;

                case "pop":
                    obj.pop();
                    break;

                case "top":
                    System.out.println(obj.top());
                    break;

                case "getMin":
                    System.out.println(obj.getMin());
                    break;
            }
        }
    }
}