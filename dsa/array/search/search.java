package array.search;
import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=sc.nextInt();
        int[] dates=new int[size]; //for declaration of array
        System.out.println("enter the elements: ");
        for(int i=0;i<size;i++){
            dates[i]=sc.nextInt(); //input of numbers of size (size)
        }
        System.out.println("enter your search element:");
        int search =sc.nextInt();
        for(int i=0;i<size;i++){//instead size we can use d(ates.length)
            if(search==dates[i]){
                System.out.println("you found the element at index"+i);
                break;
            }

        }
    }
}
