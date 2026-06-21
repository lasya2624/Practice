class mergesort{
    public void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int [n1];
        int right [] =new int [n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){//< is ascending and > is descending order
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;

        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        
    }
    public void mergesort(int arr[],int low,int high){
        if(low<high){
            int mid = low+(high-low)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args){
        int [] arr ={1,9,6,5,3,2};
        int n=arr.length;
        int low=0;
        int high=n-1;
        System.out.println("sorted array:");
        mergesort obj =new mergesort();
        obj.mergesort(arr,low,high);// mergesort i snot static so we need to create the obj
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}