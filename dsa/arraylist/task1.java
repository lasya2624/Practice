package arraylist;

import java.util.ArrayList;

public class task1 {
   

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //add elements

        list.add(5);
        list.add(3);
        list.add(7);
        System.out.print(list);
        
        // //get the element at index
        // int res = list.get(0);
        // System.out.print(res);

        // //set the element 
        // list.set(0,10);
        // System.out.print(list);

        // //removes
        // list.remove(1);
        // System.out.print(list);

        // //size
        // System.out.print(list.size());

        // //remove obj
        // list.remove("7");
        // System.out.print(list);

        // //list.contains true or false
        // System.out.print(list.contains(10));

        // //list is empty true or false
        // System.out.println(list.isEmpty());

        // //index of displays char
        // System.out.println(list.indexOf(7));

        // //last index of displays lastindex
        // System.out.println(list.lastIndexOf(10));

        Object[] arr = list.toArray();
        System.out.println(arr[0]);// converted to array
        
    }

}