public class Minjumps {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        int n = arr.length;
        int farthest = 0;
        int jumps = 0;
        int currentEnd = 0;
        for (int i =0;i<n-1;i++){
            farthest = Math.max(farthest, i+ arr[i]);
            
            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;

            }
        }

        System.out.println(jumps);
    }
}
