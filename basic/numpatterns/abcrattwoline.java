public class abcrattwoline {
    public static void main(String[] args) {
        int n=5;
        char lowercase='a';
        char uppercase='A';
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(lowercase+" "+uppercase+" ");
                lowercase++;
                uppercase++; 
            }
            System.out.println();
        }
        
    }
}
