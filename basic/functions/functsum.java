import java.util.*;
public class functsum {
    public static int sum(int x,int y){
        return x+y;
    }
    public static int product(int x,int y){
        return x*y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(sum(x,y));
        System.out.print(product(x,y));
    }
}
