public class sumofdigit {
    public static void sumofdigit(int n){
        int q=n;
        int result=0;
        while(q!=0){
            int rem=q%10;
            result=result+rem;
            q=q/10;
        }
        System.out.println(result);
    }
    public static void main(String [] args){
        int n=53;
        sumofdigit(n);
    }
}
