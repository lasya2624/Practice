import java.util.*;
public class avg {
    public static int avg(int x,int y,int z){
        int avg=(x+y+z)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(avg(x,y,z));
    }
}