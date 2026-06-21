package recursion;

public class secmax2 {
    public static void main(String[] args) {
        int [] arr ={5,6,2,1,8,9,9};
        if(arr.length<2){
           System.out.println("to find first max and second max array should atleast contain  elements");
           return;
        }
        int max = arr[0];
        int secmax =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax = max;//updating secmax before updating so the previous max value will be stored in secmax 
                max = arr[i];
            }
        }  
        System.out.println(max);
        System.out.println(secmax);
        //Arrays.sort(arr);
        //System.out.println(arr[0]);
    }
}