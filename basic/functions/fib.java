public class fib {
    public static int fibonacci(int n){
        
            if(n==0||n==1){
                return n;
            }
            int fib=fibonacci(n-1)+fibonacci(n-2);
            return fib;
    
    }
    public static void main(String[] args){
        int n=10;
        System.out.println("the fibonacci of"+n+"numbers is :");
        for(int i=0;i<=n;i++){
            System.out.print(fibonacci(i));
        }
    }
}
