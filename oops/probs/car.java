package probs;

class cardesign{
    String brand;
    String model;
    int price;
    public void details(){
        System.out.println(this.brand+this.model+this.price);
    } 
    cardesign(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
}

public class car{
    public static void main(String[] args) {
        cardesign c1=new cardesign("idk ","suzuki ",120000);
        //c1.brand="idk";
        //c1.model="suzuki";
        //c1.price=150000;
        c1.details();
    }
}