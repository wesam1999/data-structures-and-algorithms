package stack.and.queue.queue.structure;

public class class14 {
    public String DuckDuckGoose(String[] value , int k){
        int size = value.length ;
        while (k > size) {
            k = k - size;
        }
        return value[k-1];
    }




    
}
