class MyGame implements Runnable{
     public void run() {
        
        for(int i=0;i<5;i++){
            System.out.println("Thread1 is running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
} 
class MyGame2 implements Runnable{
     public void run() {
        
        for(int i=0;i<5;i++){
            System.out.println("Thread2 is running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class ImplementingRunnable {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyGame());
        Thread t2 = new Thread(new MyGame2());
        t1.start();
        t2.start();
    }
}
