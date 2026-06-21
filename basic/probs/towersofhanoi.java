public class towersofhanoi {
    public static void towersofhanoi(int n,String starter,String helper,String dest){
        if(n==1){
            System.out.println("transfer "+n+"disks from"+starter+"to"+dest);
            return;
        }
        towersofhanoi(n-1,starter,dest,helper);
        System.out.println("transfer "+n+"disks from"+starter+"to"+dest);
        towersofhanoi(n-1,starter,helper,dest);

    }
    public static void main(String[] args) {
        int n=2;
        towersofhanoi(n,"s","h","d");
    }
}
