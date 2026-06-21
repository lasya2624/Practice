package array;
import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();

        int []a=new int [n];
        System.out.print("enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);//this is helpful when array is given unsorted
        System.out.print("enter the search element: ");
        int x=sc.nextInt();
        int beg=0;
        int end=n-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(a[mid]<x){
                beg=mid+1;
            }
            else if(a[mid]==x){
                System.out.print("you found the element at index"+mid);
                break;
            }
            else{
                end=mid-1;
            }

        }

    }
}
