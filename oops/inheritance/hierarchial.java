class shape{
    public void calarea(){
        System.out.println("the area is:");
    }
}
class triangle extends shape{
    public void calarea(int l,int b){
        System.out.println(l/b);
    }
}
class square extends shape{
    public void calpower(int n,int exp){
        System.out.println(Math.pow(n,exp));
    }
}
public class hierarchial {
    public static void main(String[] args){
        square s1=new square();
        s1.calpower(5,4);
    }
}
