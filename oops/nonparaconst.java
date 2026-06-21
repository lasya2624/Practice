class student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(){
        System.out.println("hi");//non parameterised//this gets printed whenever an obj is created
    }
}
public class nonparaconst {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="arjun";
        s1.age=65;
        s1.printinfo();
    }
    
}