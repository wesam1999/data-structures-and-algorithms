package hashtable.structor;

import hashtable.Data.HashNode;

import java.util.ArrayList;
import java.util.Objects;

public class HashMap<K,V> {
    ArrayList<HashNode<K,V>> buckets;
  private int size;
    private int bucket;

    public int getSize() {
        return size;
    }

    public HashMap() {
        buckets=new ArrayList<>();
        bucket = 10;
        for (int i = 0; i < bucket; i++) {
            buckets.add(null);
        }


    }
    private final int hashCode (K key) {
        return Objects.hashCode(key);
    }
    private int getBucketIndex(K key){
        int hashCode = hashCode(key);
        int index = hashCode % bucket;
        index = index < 0 ? index * -1 : index;
        return index;
    }
    private ArrayList<K> keys(){
ArrayList<K> arrayKeys=new ArrayList<>();
HashNode list=buckets.get(bucket);
arrayKeys.add((K) list.getKey());
return  arrayKeys ;
    }
    public boolean contains(K key) {

        int bucket =hashCode(key);
        HashNode list = buckets.get(bucket);
        while (list != null) {

            if (list.getKey().equals(key))
                return true;
            list = list.getNext();
        }

        return false;
    }
    public Object get(K key) {

        int bucket = hashCode(key);
        HashNode<K,V> list = buckets.get(bucket);
        while (list != null) {

            if (list.getKey().equals(key))
                return list.getValue();
            list = list.getNext();
        }

        return null;
    }
    public void put(K key, V value) {

        int index = getBucketIndex(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = buckets.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);


        if (head == null) {
            buckets.set(index, newNode);
            size++;
        } else {

            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
        }

        if ((1.0 * size) / bucket >= 0.7) {
            ArrayList<HashNode<K, V> > temp = buckets;
            buckets = new ArrayList<>();
            bucket = 2 * bucket;
            size = 0;
            for (int i = 0; i < bucket; i++)
                buckets.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    put(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

}
