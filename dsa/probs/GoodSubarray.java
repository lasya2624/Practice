import java.util.*;
public class GoodSubarray {
    public static int GoodSub(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int left = 0;
        int maxlength = 0;
        for(int right = 0;right < n;right++){
            map.put(arr[right], map.getOrDefault(arr[right],0)+1);

            while(map.get(arr[right]) > k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxlength = Math.max(maxlength, right - left +1);
        }

        return maxlength;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        int [] arr = {1,2,1,1,3};
        int k = sc.nextInt();

        System.out.print(GoodSub(arr,k));
    }
}