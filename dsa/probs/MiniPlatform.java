import java.util.Arrays;
import java.util.Scanner;

public class MiniPlatform {
    public static int mincount(int[] arrival, int[] departure){
        int i=0;
        int j = 0;
        int pltf = 0;
        int maxpltf = 0;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        while(i < arrival.length && j < departure.length){
            if(arrival[i] < departure[j]){
                pltf++;
                i++;
                maxpltf = Math.max(pltf, maxpltf);
            }
            else{
                j++;
                pltf--;
            }

        }
        return maxpltf;
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        int[] arrival = {900,940,950,1100,1500,1800};

        int[] departure = {910,1200,1120,1130,1900,2000};

        System.out.print(mincount(arrival,departure));
    }
}
