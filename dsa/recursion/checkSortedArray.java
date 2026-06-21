package recursion;

public class checkSortedArray {
    static boolean check(int[] arr,int size){
        for(int i=0;i<size;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5};
        int size = arr.length-1;

        System.out.println(check(arr,size));
    }
}
