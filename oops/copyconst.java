class student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(student s2){
        this.name=s2.name;//this is needed
        this.age=s2.age;
    }
    student(){//copy constraints
        
    }
}

public class copyconst {
    public static void main(String[] args) { 
        student s1=new student();
        s1.name="arjun";
        s1.age=52;
        student s2=new student(s1);
        s2.info();

    }
}
