public class abcratoneline {
    public static void main(String[] args) {
        int n=7;
        char lowercase='a';
        char uppercase='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print(lowercase+" ");
                    lowercase++;
                }
                else{
                    System.out.print(uppercase+" ");
                    uppercase++;
                }
            }
            System.out.println();
        }
    }
}
