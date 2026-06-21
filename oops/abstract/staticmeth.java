class student{
    String name;
    static String school;    //tihis will be constant for all student names
}
public class staticmeth {
    public static void main(String[] args){
        student s1=new student();
        s1.name=" umesh";
        student.school="silpa ";// here student is must 
        System.out.print(s1.school+s1.name);
    }
}
