package hashing;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("HashSet: " + set);

        // set.remove(2);
        // System.out.println("After removing 2: " + set);

        System.out.println("Contains 3: " + set.contains(3));

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
