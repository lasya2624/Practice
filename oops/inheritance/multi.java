class shape{
    public void area(){
        System.out.println("the area  is:");
    }
}
class triangle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
class rectangle extends triangle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);// this is one of the ex for method overloading
    }
}
public class multi {
    public static void main(String[] args){
        rectangle r1=new rectangle();
        r1.area(5,6);
        triangle t1=new triangle();
        t1.area(5);
    }
}
