package vehicles;

interface vehi{
    default void start(){
        System.out.println("started.....");
    }
}
class car implements vehi{
    public void start(){
        System.out.println("car is starting...");
    }
}
class bike implements vehi{
    public void start(){
        System.out.println("bike is starting...");
    }
}
class vehifactory{
    public static void getvehi(String type){
        
    }
}
public class vehicles {
    public static void main(String[] args){

    }
}
