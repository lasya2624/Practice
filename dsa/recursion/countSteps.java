package recursion;

public class countSteps {
    public static int countsteps (int k) {
        if(k==0){
            return 0;
        }
        if(k%2!=0){
            return 1+countsteps(k-1);//this not returns the functon but also counts the steps
        }
        return 1+countsteps(k/2);
    }
    public static void main(String[] args) {
        int steps = countsteps(4);
        System.out.println(steps);
    }
}