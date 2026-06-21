import java.util.*;
public class hcf {
    public static int gcd(int x,int y){
        while(y!=0){
            int temp=y;
            y=y%x;
            x=temp;
        }
        return x;
    }
    public static int hcf(int x,int y){
        return gcd(x,y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("the hcf is:"+hcf(x,y));
    }
}
