public class diamalpha{
    public static void main(String[] args) {
        int n=6;
        char uppercase='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                if(j==0||j==2*i){
                    System.out.print(uppercase);
                    uppercase++;
                }
                else{
                    System.out.print(" ");
                }
                
               // if(uppercase>'Z'){
                //    uppercase='A';
               // } this is mandatory when u use large i/p size
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*i+1;j++){
                if(j==0||j==2*i){
                    System.out.print(uppercase);
                    uppercase++;
                }
                else{
                    System.out.print(" ");
                }
                
                if(uppercase>'Z'){
                    uppercase='A';
                }
            }
            System.out.println();
        }
        
    }

}
