package array;
import java.util.*;
public class spiralmatrix {
    public static void main(String[] args){
        // int row=sc.nextInt();
        // int col=sc.nextInt();
        // int [][] arr = new int[row][col];
        Scanner sc = new Scanner(System.in);
        int [][] arr= new int[4][4];
        int c=1;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){ //this is input assigning values
                arr[i][j]=c++;//this increases from 1 to n size 
            }
        }
        // this is normal matrix as input
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){ // printing this matrix
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int SR=0;
        int SC=0;
        int ER=arr.length-1;
        int EC=arr[0].length-1;
        while(SR<=ER && SC<=EC){
        for(int i=SC;i<=EC;i++){
            System.out.print(arr[SR][i]+" ");// row is common but not col 
        }
        for(int i=SR+1;i<=EC;i++){
            System.out.print(arr[i][EC]+" ");
        }
        for(int i=EC-1;i>=SC;i--){
            System.out.print(arr[ER][i]+" ");
        }
        for(int i=ER-1;i>SR;i--){
            System.out.print(arr[i][SC]+" ");
        }
        SR++;
        SC++;
        EC--;
        ER--;
    }
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(arr[i][j]+" "); this is printing the whole matrix
        //     }
        // }
    }
}
