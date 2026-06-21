import java.util.*;
public class KthSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {5,2,8,3,1,6};
        System.out.println(smallest(arr, k));
    }
    public static int smallest(int[] arr, int k){
        Arrays.sort(arr).reverse();
        return arr[k-1];
    }
}
