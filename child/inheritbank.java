//filename=inheritbank.java
//package=child
//this was inherited from bank and inheriting file
package child;
import bank.inheriting;

class children extends inheriting{
    public void accessedata(){//this should be only public and not protected
        System.out.println("accessed data");
        display();
    }
    
}

public class inheritbank {
    public static void main(String[] args) {
        children c1=new children();
        c1.accessedata();
    }
}
