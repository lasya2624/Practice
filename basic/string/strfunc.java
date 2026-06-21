package string;

public class strfunc {
    public static void main(String[] args){
        String name="umesh";
        String result=name.substring(0,name.length());
        System.out.println(result);//strings are immutable
        String name2="hii i am lasya";
        //System.out.println(name2);
        //System.out.println(name2.substring(2,name2.length()));
        //System.out.println(name2.replace('h','a'));
        //System.out.println(name2.trim());//this avoid space at the starting and ending
        //System.out.println(name.equals(name2));//returns true if both were same
        //System.out.println(name.equalsIgnoreCase(name2));these both returns false by comparing
        //String []words=name2.split(" ");
        //System.out.println(words[0]);this stores each word in the array by spliting and retrieves it and prints
        System.out.println(name.contains("um"));//checks whether it contains or not and return true,false;
    }
}
