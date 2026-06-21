package scl;

class pack extends per{

}
//instead writing each cls like student and teacher we can wrute per as both of them exists in per
public class sclapp{
    public static void main(String[] args) {
        student s1=new student("lasya",20,"A");
        teacher t1=new teacher(50000);
        System.out.println("students details are:\n name: "+s1.name+"\n age: "+s1.age+"\n grade: "+s1.grade);
        System.out.println(" teacher salary is :"+t1.salary);
    }
}