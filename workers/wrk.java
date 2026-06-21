package workers;

interface workable{
    default void work(){
        System.out.println("i do work as an engineer");
    }
}
interface payable{
    default void calsalary(){
        int salary=50000;
        int pf=568;
        System.out.println(salary+pf);
    }
}
class employee implements workable,payable{
}
public class wrk {
    public static void main(String[] args){
        employee emp1=new employee();
        emp1.work();
        emp1.calsalary();
    }
}
