public class AnothermtdofRunnable {
    public static void main(String[] args){

        // Runnable r1 = new Runnable(){
        //     public void run(){
        //         System.out.println("Thread is executed - "+Thread.currentThread().getName());
        //     }
        // };
        // Runnable r2 = new Runnable(){
        //     public void run(){
        //         System.out.println("Thread is executed - "+Thread.currentThread().getName());
        //     }
        // };





        // There is another way of creating the thread
        // this is called as lambda expressions

        Runnable r1 = ()->{
            try {
                for(int i=0;i<5;i++){
                    //Thread.sleep(1000);
                    //System.out.println("Thread is executed - "+Thread.currentThread().getName());
                }
            } catch (Exception e) {
            }
            
        };

        Runnable r2 = ()->{
            try {
                for(int i=0;i<5;i++){
                    //Thread.sleep(1000);
                    
                   // System.out.println("Thread is executed - "+Thread.currentThread().getName());
                }
            } catch (Exception e) {
            }
            
        };

        Thread t1 = new Thread(r1,"t1");
        Thread t2 = new Thread(r2,"t2");// its ok there is no need to give name for ypur threads if name is not given the name is automatically 
        //assigned like 0,1,2,...etc.
        System.out.println(t1.getState());
        t1.start();
        //t1.sleep(1000);
        System.out.println(t1.getState());
        t2.start();
        System.out.println(t1.getState());
       
    }
}// currentThread().getName()
//currentThread.getId()
//currentThread.getPriority()
//currentThread.getState()
//Thread.activeCount()




//0->new
//1->running
//2->blocked
//3->waiting(join)
//4->waiting(specific time/ sleep)
//5->terminated