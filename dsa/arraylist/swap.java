package arraylist;

import java.util.ArrayList;

public class swap {
    static void swap(ArrayList<Integer> list,int ind1,int ind2){
        int first =list.get(ind1);
        int sec = list.get(ind2);
        list.set(ind1,sec);
        list.set(ind2,first);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        swap(list,0,1);
    }
}
