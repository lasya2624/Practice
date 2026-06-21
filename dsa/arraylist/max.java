package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class max {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(7);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(list.get(i),max);
        }
        System.out.println(max);
        Collections.sort(list);//sorts the list
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());//in reverse order
        System.out.println(list);

        
    }
}
    