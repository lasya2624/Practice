package scl;

class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
        
    }

}
class student extends person{
    String grade;
    student(String name,int age,String grade){
        super(name,age);
        this.grade=grade;
        
    }

}
class teacher   {
    int salary;
    teacher(int salary){
        this.salary=salary;
    }
}

public class per{
    public static void main(String[] args){
        student s1=new student("lasya",20,"A");
        teacher t1=new teacher(50000);
        //System.out.println("students details are:\n name: "+s1.name+"\n age: "+s1.age+"\n grade: "+s1.grade);
        //System.out.println(" teacher salary is :"+t1.salary);
    }
}