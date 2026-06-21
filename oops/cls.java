class pen{
    String colour;
    String type;
    public void write(){
        System.out.println("written someting");
    }
    public void printcolour(){
        System.out.println(this.colour);
        System.out.println(this.type);
    }
}
class student{
    String name;
    int rollno;
    public void information(){
        System.out.println("name of student is :"+this.name);
        System.out.println("her roll no is :"+this.rollno);
    }
}
public class cls {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.colour="black";
        p1.type="ink";

        pen p2=new pen();
        p2.colour="navy blue";
        p2.type="bold";

        p2.printcolour();
        

        student s1=new student();
        s1.name="lasya";
        s1.rollno=21;

        s1.information();
        System.out.println(s1.name);//this gives nameo
    }
}
