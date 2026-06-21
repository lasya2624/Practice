package array;

public class diagonalsum {
    public static void main(String[] args) {
        int [][] arr = new int [4][4];
        int c=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=c++;
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        // }


        //diagonals sum
        //1(0,0)    2       3      4(0,3)
        //5        6(1,1)  7(1,2)  8
        //9        10(2,1) 11(2,2) 12
        //13(3,0)  14      15      16(3,3)
          // from left to right diagonal i++&j++
          //from right to left diagonal i++j--;
       int i=0;
       int j=0;
       int sumlr=0;
       // this is for left to right diagonal 
       while(i<4 && j<4){
        sumlr += arr[i][j];
        i++;
        j++;
       }
       //this is for right to left diagonal 
       int sumrl=0;
       int k=0;
       int m=3;
       while(k<4 && m<4){
        sumrl+=arr[k][m];
        k++;
        m--;
       }
       System.out.println("sum of right to left diagonal :"+sumlr);
       System.out.println("sum of right to left diagonal :"+sumrl);

    }
}
