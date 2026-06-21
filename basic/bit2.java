import java.util.*;

public class bit2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        int pos=2;
        int n=5;
        int bitmask=1<<pos;
        if(op==1){
            int number=bitmask | n;
            System.out.print(number);
        }
        else{
            int notbitmask= ~(bitmask);
            int number=notbitmask & n;
            System.out.println(number);
        }

    }
}
//update bit