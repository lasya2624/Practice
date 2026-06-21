package array.sort;

public class mergesort {
    public static void conquer(int ar[],int si,int mid,int ei){
        int merge[]=new int[ei-si+1];//ar.length cant be written and ei-si+1 is needed bcz ei=7 but actuall length is 8 so +1
        int x=0;//for indexing the array
        int idx1 = si;
        int idx2=mid+1;
        while(idx1 <= mid && idx2 <= ei){
            if(ar[idx1]<=ar[idx2]){
                merge[x]=ar[idx1];
                x++; idx1++;
            }
            else{
                merge[x]=ar[idx2];
                x++; idx2++;
            }
        }
        while(idx1<=mid){
            merge[x]=ar[idx1];
            x++; idx1++;
        }
        while(idx2<=ei){
            merge[x]=ar[idx2];
            x++; idx2++;
        }
        for(int i=0,j=si;i<merge.length;j++,i++){
            ar[j]=merge[i];
        }
    }
    public static void divide(int ar[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;//this must not be written before if condiiton this is else part
        divide(ar,si,mid);
        divide(ar,mid+1,ei);
        conquer(ar,si,mid,ei);
    }
    public static void main(String[] args){
        int ar[]={2,1,3,9,6,8};
        int n=ar.length;
        divide(ar,0,n-1);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
