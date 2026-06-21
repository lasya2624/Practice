class Test extends Thread{
    public void run() {
        System.out.println("currentThread:"+ currentThread().getName());
        System.out.println("currentThread Priority:"+ currentThread().getPriority());// the result will be default or norm priority i.e., 5
        for(int i=0;i<5;i++){
            System.out.println("Thread1 is running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class Testing extends Thread{
    public void run() {
        System.out.println("currentThread:"+ currentThread().getName());
        System.out.println("currentThread Priority:"+ currentThread().getPriority());
        for(int i=0;i<5;i++){
            System.out.println("Thread2 is running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class ExtendClass {
    public static void main(String[] args) {
        Test t1 = new Test();
        Testing t2 = new Testing();
        t1.start();
        t2.start();
    }
}
