import java.util.*;
public class ratpattern {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){//instead of reversing the loop from n to i we can use n-i
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
