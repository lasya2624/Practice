package animal;

interface anin{
    void sound();
}
class dog implements anin{
    public void sound(){
        System.out.println("boww");
    }

}
class cat implements anin{
    public void sound(){
        System.out.println("meow");
    }
}

public class ani{
    public static void main(String[] args) {
        dog d1=new dog();
        cat c1=new cat();
    }
}
