class shape{
    public void area(){
        System.out.println("area is ");//base clas 
    }
}
class triangle extends shape{
    public void area(int l,int b){
        System.out.println(0.5*l*b);
    }
}
public class single {//this is called single level inheritance
    public static void main(String[] args){
        triangle t1=new triangle();
        t1.area(5,6);
    }
}