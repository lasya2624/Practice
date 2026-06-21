import java.util.*;
public class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr ={"hello","lo","hero","superhero","maass","ass"};
        compare(arr);
    }
    public static void compare(String[] arr){
        // String s1 = arr[0];
        int j = 0;
        String [] newArr = new String[arr.length];
        for(int i=1; i<arr.length;i++){
            if(arr[i-1].contains(arr[i]) || arr[i].contains(arr[i-1])){
                if(arr[i].length() > arr[i-1].length()) {
                    newArr[j] = arr[i-1]; 
                }
                if(arr[i].length() < arr[i-1].length()){
                    newArr[j] = arr[i];
                }
                j++;
            }
        }


        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}