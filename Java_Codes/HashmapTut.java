import java.util.*;

public class HashmapTut {
    
    static class HashMap<K, V> {
        public class Node {
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
    
        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }
        private int searchLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            N *= 2;
            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            } else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);
            if(di == -1){
                return false;
            } else{
                return true;
            }
        }
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);
            if(di == -1){
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);
            if(di == -1){
                return null;
            } else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    keys.add(ll.get(j).key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
        public void exactStructure(){
            for(int i=0; i<N; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    System.out.print(ll.get(j).key + ", ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Olivia", 23);
        map.put("Jake", 22);
        map.put("Chris", 21);
        map.put("Emma", 20);
        map.put("Anna", 20);
        map.put("Alex", 18);
        map.put("Sophie", 6);
        map.put("Valka", 49);
        map.put("Lisa", 20);
        ArrayList<String> keys = map.keySet();
        System.out.println(keys);
        map.exactStructure();
    }
}
