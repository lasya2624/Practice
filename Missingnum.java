import java.util.*;
class Missingnum{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,7,8,9,10};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]+1 != arr[i+1]){
                System.out.println(arr[i]+1);
            }
        }

    }
}