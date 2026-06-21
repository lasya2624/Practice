package bank;

class Account{
    private String name;
    //public Account (String name){
      // this.name=name;
    //}
    public String getname(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

public class privat {
    public static void main(String[] args) {
        Account acc=new Account();//in bracket "lasya"
        acc.setName("sasi");
        System.out.println("updated name is: "+acc.getname());
        //System.out.println(acc.name);
    }
}