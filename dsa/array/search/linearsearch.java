package array;
public class linearsearch {
    public static void main(String[] args){
        int[] ele={2,1,2,6,7,3,0};
        int x=7;
        for(int i=0;i<ele.length;i++){
            if(x==ele[i]){
                System.out.println("element found at index:"+i);
                break;
            }
        }
    }
}
