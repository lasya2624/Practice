package child;
import bank.student;

class study extends student{
    public void access(){
        details();
    }
}
public class stubank {
    public static void main(String[] args) {
        study s1=new study();
        s1.access();
    }
}
