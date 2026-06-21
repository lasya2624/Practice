package bank;

public class student {
    protected String name="lasya";
    protected int id=101;
    protected void details(){
        System.out.println("details of student 1:");
        System.out.println(name+" "+id);
    }

    public static void main(String[] args) {
        student s1=new student();
        s1.details();
    }
}
