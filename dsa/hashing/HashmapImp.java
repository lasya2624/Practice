package hashing;
import java.util.*;

public class HashmapImp {
    static class HashMap<K,V>{

        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //no.of nodes
        private int N; //no.of buckets
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N; //if %N then the bi will range btw 0 - (N-1)
        }
        private int search(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i) == key){
                    return i;
                }
            }
            return -1;

        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = search(key,bi);
            if(di == -1){
                buckets[bi].add(new Node(key, value));
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n / N;
            if(lambda > 3.0){
                //rehashing
                rehash();
            }
        }
        public void rehash(){
            LinkedList<Node> old []= buckets;
            buckets = new LinkedList[N*2];

            for(int i=0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }
            
            for(int i=0;i<old.length;i++){
                LinkedList<Node> ll = old[i];
                for(int j=0;j<ll.size();i++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = search(key,bi);
            if(di == -1){
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                return node.value;
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = search(key,bi);
            if(di == -1){
                return false;
            }
            return true;
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = search(key,bi);
            if(di == -1){
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public boolean isEmpty(){
            return n == 0;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> al = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0;j<ll.size();i++){
                    Node node = ll.get(j);
                    al.add(node.key);
                }
            }
            return al;
        } 

    }
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("lasya", 56);
        map.put("vennela", 72);
        map.put("lassi", 69);
        map.put("berry", 83);

        ArrayList<String> keys = new ArrayList<>();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i) + " "+ map.get(keys.get(i)));
        }
    }
}
