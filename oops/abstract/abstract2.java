interface animal{
    void sound();
    default void ani(){//default is neccessary when public is declared only default also can be used
        //it gives error when e use public mostly in case of interfaces  we use default 
        System.out.println("these are of different shapes");
    }
}
interface mamals{
    void sound();
}
class dog implements animal,mamals{
    public void sound(){
        System.out.println("bowwwww");
    }
}
class cat implements animal,mamals{
    public void sound(){
        System.out.println("meeowww");
    }
}
public class abstract2 {
    public static void main(String[] args){
        dog d1=new dog();
        d1.sound();
        d1.ani();
    }
}
//we use interface instead abstract bcz javaallows only one abstarct class but multiple interfaces