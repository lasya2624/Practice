package hashing;
import java.util.HashMap;
import java.util.Set;


public class Hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("Apple",1);
        map.put("Orange", 2);
        map.put("Banana", 5);

        //Remove
        // map.remove("Orange");
        
        //Update
        map.put("Apple",3);

        System.out.println(map);
        
        // for loop
        // for(Map.Entry<String, Integer> e: map.entrySet()){
        //     System.out.print(e.getKey() + " " + e.getValue() + " ");
        // }

        //for loop
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        
    }
}
