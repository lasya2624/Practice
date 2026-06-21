import java.util.Scanner;

public class revsiderat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=-n;j<=n;j++){
                if(-(n-i)<j&&(n-i)>j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}