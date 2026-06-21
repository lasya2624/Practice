package array.sort;

public class Insertionsort {
    public static void main(String[] args){
        int in[]={5,6,2,1,3,9,4};
        for(int i=1;i<in.length;i++){  // i=0 || i=1 either 
            int temp = in[i];
            int j=i-1;
            while(j>=0 && in[j]>temp){
                in[j+1]=in[j];
                j--;// j needs to get decremented bcz when i moves the unsorted no.of elements in 
                //the left increases so it should check all the elements in the unsorted with the tempas un sorted|sorted
            }
            in[j+1]=temp;
        }
        System.out.println("sorted array is : ");
        for(int i=0;i<in.length;i++){
            System.out.print(in[i]+ " ");
        }
    }
}