import java.util.*;
public class lcm {
    public static int gcd(int a,int b){
        while(b!=0){
            //int temp=b;
            //b=a%b;
            //a=temp;
            return gcd(b,a%b);
        }
        return a;
    }
    public static int calc(int a,int b){
        return(a*b)/gcd(a,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("the lcm for " + a + "and" + b + "is : " + calc(a,b));
    }
}
