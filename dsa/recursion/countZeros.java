package recursion;

public class countZeros {
    static void number(int n){
        int count=0;
        while(n!=0){
            int rem = n % 10;
            if(rem==0){
                count++;
            }
            n=n/10;        
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        number(1430060);
    }
}
