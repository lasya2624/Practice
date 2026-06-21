import java.util.*;
public class HackwithInfy2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> A  = new ArrayList<>();
        Collections.addAll(A, 1, 2, 3, 4, 5);
        
        int n = A.size();
        int k = sc.nextInt();

        System.out.println(method(A,k,n));
    }
    public static int  method(List<Integer>A, int k, int N){

    int[] dp = new int[N];

    for(int i = 0; i < N; i++){
        dp[i] = A.get(i);
    }
    
    int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j = i-1;j>=0 && i-j <=k;j--){

                int p1 = Math.abs(A.get(i)) % 2;
                int p2 = Math.abs(A.get(j)) % 2;

                if(p1 != p2){
                    dp[i] = Math.max(dp[i] , dp[j] + A.get(i));
                }
            }

            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }

}
