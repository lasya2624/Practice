import java.util.Scanner;

public class hollowrect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=-n;j<=n+1;j++){
                if(i==0||i==n||j==n+1||j==-n){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
        System.out.println();
        }
        sc.close();
    }
}
