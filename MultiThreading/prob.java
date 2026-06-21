public class prob {
    public static void main(String[] args) throws Exception{

        brick b = new brick();
        Runnable r1 =()->{//this is lambda expression syntax
            for(int i=0;i<4000;i+=50){
                b.increment();
            }
        };
        Runnable r2 =()->{
            for(int i=0;i<6000;i+=50){
                b.increment();
            }
        };
        Runnable r3 =()->{

            for(int i=0;i<15000;i+=50){
                b.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
        //if you dont write .join() these executes independently without waiting for each other to complete
        //.join()=> it will wait for the thread to finish its execution before moving to next thread
        t1.join();
        t2.join();
        t3.join();
        System.out.println(b.count);
    }
    
}
// by sometimes writing code only with start, join doesnt result the exact value bcz of race condition same time both the r1, or r, or r3 
//gets increment so it will be detected as 50 not 50+50, thus we might not get same value when we run repeatedly.
// so we use synchronization to avoid this.
class brick{
    int count;
    public synchronized void increment(){//synchronized key word avoids Race condition, prints eaxct count if not it will be always less than 25000 for given ip
        count+=50;
    }
}
//public static void main(String[] args) throws Exception
// When you deal with multithreading, you often use methods like:

// Thread.sleep(milliseconds)

// join()

// Both of these methods can throw a checked exception called InterruptedException.
//So, instead of wrapping every Thread.sleep() in a try-catch, the author just wrote: