public class circum {
    public static float circle(int r){
        float pi=3.18f;//f suffix is neccessary when ur assigning a value float in java
        float circum=2*pi*r;
        return circum;
    }
    public static void main(String[] args) {
        int r=6;
        System.out.println(circle(r));
    }
}
