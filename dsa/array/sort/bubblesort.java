package array.sort;


    public class bubblesort {
        public static void main(String[] args) {
            int bub[]={5,6,9,8,3};
            int n = bub.length;
            for(int i=0;i<n-1;i++){
                for(int j = 0;j<n-i-1;j++){
                    if(bub[j] > bub[j+1]){
                        int temp = bub[j];
                        bub[j] = bub[j+1];
                        bub[j+1] = temp;
                    }
                }
            }

            for(int num : bub){
                System.out.println(num + " ");
            }
        }  
    }