abstract class school{     //before class we are writing abstract
    abstract void details();   //instead public we write abstract  and instead{} this beside details we place ;
    public void from(){
        System.out.println("from silpa school");
    }
    school(){
        System.out.println("this consists of school details");
    }
}
class teacher extends school{
    public void details(){
        System.out.println("there are 4 teachers");
    }
    teacher(){
        System.out.println("this consists of teacher details");
    }
}
class students extends school{
    public void details(){
        System.out.println("there are 100 students");
    }
}
public class abstr {
    public static void main(String[] args) {
        students s1=new students();
        //here teacher constructor isn't going to print bcz we didnt call that and if we the school constr going to print for twice 
        //bcz the student calls the scl class for once and the teacher calls again hence twice
      //  animal ani=new animal();
       // ani.details();    //for example  these two lines throw error cz it is abstract class cant be accesed directly through objs
        s1.details();
        s1.from();
    }
}