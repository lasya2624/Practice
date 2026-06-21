class teacher{
    String name;
    String subject;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.subject);
        System.out.println(this.age);
    }
    teacher(String name,String subject,int age){//parameterised
        this.name=name;
        this.subject=subject;
        this.age=age;
    }
}
public class parameterised {
    public static void main(String[] args) {
        teacher t1=new teacher("aradhya","maths",52);
        t1.printinfo();
    }
}
