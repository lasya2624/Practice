package array;
import java.util.*;

public class twodarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no.of rows:");
        int rows=sc.nextInt();
        System.out.print("enter no.of cols:");
        int cols=sc.nextInt();

        int [][] numbers = new int[rows][cols];
        System.out.print("enter the values of rows and cols:\n");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt(); 
            }
        }

        System.out.print("the matrix is :\n");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
