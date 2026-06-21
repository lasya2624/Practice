package string;

public class strpalindrome {
    public static boolean  isplaindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;//if we write == in if condition after the condition it will be having two return statements so it writes the 
            j--;//first return statement that is return false even if it is true it will return false 
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isplaindrome("madam"));
        System.out.println(isplaindrome("hello"));
    }
}
