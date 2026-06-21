import java.util.*;
public class eachascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);//traverses each index in the line seperately 
            System.out.println(ch);
            if(ch ==' ') {// for string u use single qoutes
                continue;
            }
            else{
                System.out.println((int)ch);
            }
        }
        sc.close();
    }
}
