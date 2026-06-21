package except;

import java.util.*;

public class division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result= a/b;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("cahnge the value of b instead 0");
        }
        finally{
            System.out.println("successfully done");
        }
    }
}
