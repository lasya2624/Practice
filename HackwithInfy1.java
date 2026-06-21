public class HackwithInfy1{
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,8};
        int n = arr.length;

        System.out.println(method(arr,n));

    }

    public static int method(int[] arr, int n){
        
        for(int k = n;k>=1;k--){
            boolean found = false;
            for(int i=0;i<=n-k;i++){
                int min = Integer.MAX_VALUE;
                for(int j=i;j<i+k;j++){
                    min = Math.min(min, arr[j]);
                }
                if(min >= k){
                    found=true;
                    break;
                }
            }

            if(found){
                return k;
            }
            
        }

        return 0;
    }
}