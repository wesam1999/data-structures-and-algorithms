package hashtable.structor;

import hashtable.Data.HashNode;

import java.util.ArrayList;


public class HashMap<K, V> {
    ArrayList<HashNode<K, V>> buckets;
    private int size;
    private int bucket;

    public int getSize() {
        return size;
    }

    public HashMap() {
        buckets = new ArrayList<>();
        bucket = 10;
        for (int i = 0; i < bucket; i++) {
            buckets.add(null);
        }


    }

    private int hashCode(Object key) {

        return (Math.abs(key.hashCode())) % buckets.size();
    }

    public ArrayList<K> keys() {
        ArrayList<K> arrayKeys = new ArrayList<>();

        for (int i = 0; i < buckets.size(); i++) {

            HashNode list = buckets.get(i);

            if (list != null) {

                    System.out.println(list.getKey());
                    arrayKeys.add((K) list.getKey());
                    if (list.getNext() !=null) {
                        for (int j = 0; j <buckets.size() ; j++) {
                            arrayKeys.add((K) list.getNext().getKey());
                        }
                    }
                }


        }
        return arrayKeys;
    }

    public boolean contains(K key) {

        int bucket = hashCode(key);
        HashNode list = buckets.get(bucket);
        while (list != null) {

            if (list.getKey().equals(key))
                return true;
            list = list.getNext();
        }

        return false;
    }

    public V get(K key) {

        int bucket = hashCode(key);
        HashNode<K, V> list = buckets.get(bucket);
        while (list != null) {

            if (list.getKey().equals(key))
                return list.getValue();
            list = list.getNext();
        }

        return null;
    }

    public void put(K key, V value) {

        int bucket = hashCode(key);
        HashNode list = buckets.get(bucket);

        while (list != null) {

            if (list.getKey().equals(key))
                break;
            list = list.getNext();
        }

        if (list != null) {

            list.setValue(value);
        } else {

            if (size >= 0.75 * buckets.size()) {

                resize();
            }
            HashNode newNode = new HashNode();
            newNode.setKey(key);
            newNode.setValue(value);
            newNode.setNext(buckets.get(bucket));
            buckets.set(bucket, newNode);
            size++;
        }
    }

    private void resize() {

        ArrayList<HashNode<K, V>> newtable = new ArrayList<>();
        for (int i = 0; i < buckets.size(); i++) {

            HashNode list = buckets.get(i);
            while (list != null) {

                HashNode next = list.getNext();

                int hash = (Math.abs(list.getKey().hashCode())) % newtable.size();

                list.setNext(newtable.get(hash));
                newtable.set(hash, list);
                list = next;
            }
        }
        buckets = newtable;
    }
    public String hashmap_repeated_word(String s)
    {


        String token[] = s.split(" ");


        HashMap<String, Integer> setOfWords = new HashMap<String, Integer>();



        for (int i=0; i<token.length; i++) {
            if (setOfWords.contains(token[i]))
                setOfWords.put(token[i], setOfWords.get(token[i]) + 1);
            else

                setOfWords.put(token[i], 1);
        }


        for (int i=0; i<token.length; i++) {
            int count = setOfWords.get(token[i]);
            if (count > 1) {
                return token[i];
            }
        }

        return "NoRepetition";
    }

}
