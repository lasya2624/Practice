import java.util.*;
public class MinCOunt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();

        String wrd = word.toUpperCase();
        for(char c: wrd.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int value = 0;

        for(int count:map.values()){
            if(count > value){
                value = count;
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == value){
                System.out.println(entry.getKey());
            }
        }
    }
}
