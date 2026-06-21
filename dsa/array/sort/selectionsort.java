package array.sort;

public class selectionsort {
    public static void print(int sel[]){
        for(int i=0;i<sel.length;i++){
            System.out.print(sel[i]+" ");
        }
    }
    public static void main(String[] args){
        //this is thr process where 1st(largest) element is compared with the next least element and swaps it
        int sel[]={8,6,1,3,2,7};//8 is swapped with 6 cz it is small in the next and 8 with 1 cz it is occuring first than 2
        for(int i=0;i<sel.length-1;i++){//no of times the iteration takes place similar to bubble sort
            int min=i;
            for(int j=i+1;j<sel.length;j++){
                if(sel[j]>sel[min]){//<,swap you can use here but instead i u will place j and u can remove over there down  
                    min=j;
                }
            }
            int temp = sel[min];//when i is the first element it compares with all other elements by traversing through j loop
            sel[min]=sel[i];
            sel[i]=temp;
        }
        print(sel);
    }
}
