package probs;

class account{
    private int accnumber;
    private int balance;
    public int getaccnumber(){
        return accnumber;
    }
    public int getbalance(){
        return balance;
    }
    public void setaccnumber(int accnumber){
        this.accnumber=accnumber;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
}
public class bank {
    public static void main(String[] args){
        account a1=new account();
        a1.setaccnumber(563);
        a1.setbalance(9800);
        System.out.println(a1.getaccnumber());
        System.out.println(a1.getbalance());
    }
}
