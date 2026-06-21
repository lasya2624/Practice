public class armstrong {
    public static void armstrong(int n){
        int q=n;
        int count=0;
        int result=0;
        while(q!=0){
            count++;
            q=q/10;
        }
        q=n;
        while(q!=0){
            int number=q%10;
            result+=Math.pow(number,count);
            q=q/10;
        }
        if(result==n){
            System.out.print("this is armstrong number");

        }
        else{
            System.out.print("not an armstrong");
        }
       
    }
    public static void main(String[] args) {
        int n=153;
        armstrong(n);
    }

}