//file=inheriting
//pacakge=bank
package bank;

//you can also write it in the class inheriting but in creeation of obj you should name it as inher... inh=new inher...
//its gonna be easywhen you write it in the same class rather creating other
public class inheriting {
    protected String data="lasya";
    protected void display(){
        System.out.println(data);
    }
    public static void main(String[] args) {
        inheriting inh=new inheriting();
        inh.display();
    }
}
