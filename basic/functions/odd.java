public class odd {
    public static int odd(int n){
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n=15;
        odd(n);
    }
}
