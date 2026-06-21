public class palindrome {
    public static void palin(int n){
        int a=n;
        int b=0;
        while(a!=0){
            int rem=a%10;
            b=b*10+rem;
            a=a/10;
        }
        if(b==n){
            System.out.println("this is palindrome");
        }
        else{
            System.out.println("not an palindrome");
        }

    }
    public static void main(String[] args){
        int n=153;
        palin(n);
    }
}
