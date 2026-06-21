import java.util.*;
public class lcm {
    public static int gcd(int x,int y){
        while(y!=0){
            int temp=y;
            y=y%x;
            x=temp;
        }
        return x;
    }
    public static int lcm(int x,int y){
        int LCM=x*y/gcd(x,y);
        return LCM;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int lcm_result=lcm(x,y);
        System.out.println("The lcm is : "+lcm_result);

    }
}
