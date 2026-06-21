package string;

public class strbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("lasya");
        System.out.println(sb.append(" umesh"));
        //System.out.println(sb.charAt(1));returns a
        //sb.setCharAt(0,'h');
        //System.out.println(sb);this replaces permanently
        sb.insert(0,'U');
        System.out.println(sb);//this extra adds the letter at the index
        sb.delete(0,1);//from 0 to 1
        System.out.println(sb);//this deletes the index 
        System.out.println(sb.length());
        //for(int i=sb.length();i>0;i--){
          //  System.out.println(i);
        //}
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.print(sb.substring(0,7));//this strats indexing from last such that in lasya umesh h takes 0th index
    }
}