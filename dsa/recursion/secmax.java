package recursion;

public class secmax {
    public static void main(String[] args) {
        int [] arr ={5,6,2,1,8,9,9};
        if(arr.length<2){
           System.out.println("to find first max and second max array should atleast contain  elements");
           return;
        }
        int max = arr[0];
        int secmax =arr[0];
        for(int i=0;i<arr.length;i++){//for(int num:arr)
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i] > secmax){
                secmax = arr[i];
            }
        }
        
        System.out.println(max);
        System.out.println(secmax);
        //Arrays.sort(arr);
        //System.out.println(arr[0]);
    }
}
