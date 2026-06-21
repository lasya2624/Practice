import java.util.Scanner;

public class pow {
    public static int power(int x,int y){
        if(y==0||y==1){
            return x;
        }
        return x*power(x,y-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(power(x,y));
    }
}
