class lasya{
    public void student(String name){
        System.out.println(" the name is :"+name);
    }
}
class umesh extends lasya{
    public void student(int rollno){
        System.out.println(rollno);
    }
}
class sasi extends lasya{
    public void student(int age){
        System.out.println(age);
    }
}
class mummy extends sasi{
    public void student(String dept){
        System.out.println(dept);
    }
}
public class derived {
    public static void main(String[] args) {
        mummy mom1=new mummy();
        mom1.student("civi engineering");
        umesh um1=new umesh();
        um1.student(30);
        lasya l1=new lasya();
        l1.student("lassi");
    }
}
