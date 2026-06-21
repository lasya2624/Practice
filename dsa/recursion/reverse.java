package recursion;

public class reverse {
    static void number(int n){
        int result =0;
        while(n!=0){
            int rem = n%10;
            result = result * 10 + rem;
            n = n/10;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        number(143);
    }
}
