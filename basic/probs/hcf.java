import java.util.*;
public class hcf {
    public static int gcd(int a,int b){
        while(b!=0){
            return gcd(b,a%b);
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("hcf is : "+gcd(a,b));
    }
}