package string;

public class largeststring {
    public static void main(String[] args) {
        String[] words={"lasya","umesh","chandra"};
        String s="";
        for(String word:words){
            if(word.length()>s.length()){
                s=word;// at start the s is empty so the first word will be stored in s and next word will be 
                //checked with s if it is larger it will be fixed as large else goes for another
            }
        }
        System.out.println("lasrgest string is :"+s);
    }
}
