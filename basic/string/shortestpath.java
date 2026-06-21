package string;

public class shortestpath {
    public static void main(String[] args) {
        String str = "WNEENESENNNN";

        int x = 0;
        int y = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'W'){
                x--;
            }
            else if(ch == 'E'){
                x++;
            }
            else if(ch == 'N'){
                y++;
            }
            else{
                y--;
            }
            
        }
        double distance = Math.sqrt(y*y-x*x);
        System.out.println(distance);
    }
}
