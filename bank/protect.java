package bank;

class parent{
    //private String name;
    protected int age=15;
    protected void display(){
        System.out.println(age);//we can also use getter and setter same as private modifier
    }
    
   // public String getname(){
   //     return name;
  //  }
   // public void setname(String name){
   //     this.name=name;
   // }
}

public class protect {
    public static void main(String[] args) {
        parent p1=new parent();   
        p1.display();
       // p1.setname("lasya");
       // System.out.println(p1.getname());
    }
}
