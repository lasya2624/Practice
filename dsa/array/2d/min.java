package array;
import java.util.*;

public class min {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] find = new int [n];
        for(int i=0;i<n;i++){
            find[i]=sc.nextInt();
            int min = find[0];
            if(find[i]<=min){
                min = find[i];
                System.out.println("the minimum value is : " + min);
            }
        }//similarly max element identification
    }
}