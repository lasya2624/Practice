package string;

public class op {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        //b=a++;
        b=++a;
        System.out.println(a);//11//11
        System.out.println(b);//10//11
    }
    
}