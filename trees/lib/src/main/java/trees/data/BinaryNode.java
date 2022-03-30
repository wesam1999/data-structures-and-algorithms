package trees.data;

public class BinaryNode <T extends Comparable<T>> extends Node{


    public BinaryNode(T data) {
        super(data);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
