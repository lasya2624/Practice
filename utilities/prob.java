package utilities;

interface mathutility{
    default void square(int n){
        System.out.println(n*n);
    }
}
class mathoperations implements mathutility{

}
class advancedmath implements mathutility{
    static String name="lasya";
}
public class prob {
    public static void main(String[] args) {
       mathoperations m1=new mathoperations();// we cant create inheritance mathutility as obj 
       advancedmath a1=new advancedmath();
       System.out.println(advancedmath.name);
       m1.square(5);

    }
}