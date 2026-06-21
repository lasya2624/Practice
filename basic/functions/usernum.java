import java.util.*;
public class usernum {
    public static void main(String[] args){
        int positive=0;
        int negative=0;
        int zeros=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1 to continue or 0 to stop");
        int input=sc.nextInt();
        while(input==1){
            System.out.print("enter the value to insert:");
            int n=sc.nextInt();
            if(n>0){
                positive++;
            }
            else if(n<0){
                negative++;
            }
            else{
                zeros++;
            }
            System.out.println("press 1 to continue or 0 to stop");
            input=sc.nextInt();

        }


        System.out.println("the positive numbers are: "+positive);
        System.out.println("the positive numbers are: "+negative);
        System.out.println("the positive numbers are: "+zeros);
    }
}
