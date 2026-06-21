package array;
import java.util.*;
public class createStream {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("this size of the aray is:"+size);
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int [] unique = Arrays.stream(array).distinct().toArray();
        System.out.println("the elements in the array are:");
        for(int i=0;i<size;i++){
            System.out.println(unique[i]);// if u want to check whether this is working then you should decrease the i for size -1 
            //if not you can continue with <size
            // the main func is it avoids duplicates in array
        }
    }
}