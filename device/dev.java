package device;

abstract class Device{
    abstract void turnon();
    abstract void turnoff();// you no need to write {} bcz abstract is just for presence not to execute
}
interface rechargeable{
    default void recharge(){
        System.out.println("recharging......");
    }
}
class smartphone extends Device implements rechargeable{
    public void turnon(){
        System.out.println("device turns on");
    }
    public void turnoff(){
        System.out.println("if it reaches 2% charge device turns off");
    }

}
public class dev {
    public static void main(String[] args) {
        smartphone sim1=new smartphone();
        sim1.recharge();
        sim1.turnon();
        sim1.turnoff();
    }
}