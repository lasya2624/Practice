import java.util.*;

public class Work {
    // int id;
    // String name;
    // String dept;

    // Work(int id, String name, String dept){
    //     this.id = id;
    //     this.name  =name;
    //     this.dept = dept;
    // }
    // public static void main(String[] args) {
    //     ArrayList<Work> li = new ArrayList<>();
    //     li.add(new Work(5,"l" ,"IT"));
    //     li.add(new Work(1,"la" ,"cse"));
    //     li.add(new Work(9,"las" ,"mech"));
    //     li.add(new Work(8,"lasya" ,"ece"));

    //     // Collections.sort(li,(a,b)->a.id - b.id);

    //     Collections.sort(li, new Comparator<Work>() {

    //     @Override
    //     public int compare(Work p1, Work p2) {

    //         return Integer.compare(p1.id, p2.id);

    //     }
    // });
    //     System.out.println(li);

    // }

     
        Work(String name){
            this.name = name;
        }
    public static void main(String[] args) {
       
        String jupiter = " this is a coding platform used by the students to compile and write progrmas";
        String hp = " this is a company that supplies systems tot he users offers computers , laptops and different products";
        String Lakme = " This is a cosmetic product used by the women";

        List<String> list = new ArrayList<>();

        list.add(jupiter);
        list.add(hp);
        list.add(Lakme);

        Scanner sc = new Scanner(System.in);
        System.out.println("choose the product you want : 1. jupiter, 2.Hp, 3. Lakme");
        String word = sc.nextLine();

        if(word.toLowerCase() == "jupiter"){
            if(list.contains(jupiter)){
                System.out.println(jupiter);
            }
        }
        else if (word.toLowerCase() == "hp"){
             if(list.contains(hp)){
                System.out.println(hp);
            }
        }
        else{
            if(list.contains(Lakme)){
                System.out.println(Lakme);
            }
        }

    }
    


}
