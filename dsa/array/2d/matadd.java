package array;
import java.util.*;

public class matadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row1 and col1:\n");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int [][] mat1=new int[row1][col1];
        System.out.println("enter mat1:\n");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter row2 and col2:\n");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int [][] mat2=new int[row2][col2];
        System.out.println("enter mat2:\n");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        if(row1!=row2||col1!=col2){
            System.out.println("matrices cannot be added they should hvae same dimensions");
        }
        else{
            System.out.println("the sum of mat1 and mat2 is:\n");
            int [][]sum=new int[row1][col1];
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    sum[i][j]=mat1[i][j]+mat2[i][j];
                }
            }
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}