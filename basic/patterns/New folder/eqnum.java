import java.util.Scanner;

public class eqnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n-1;i++){
            for(int k=1;k<=(2*n-1)-(i*2);k++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
