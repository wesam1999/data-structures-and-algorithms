package hashtable.Data;

public class HashNode<K,V> {
    private K key;
    private V value;
    private int hashCode;
    private HashNode<K,V> next;

    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public HashNode<K, V> getNext() {
        return next;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }
}
