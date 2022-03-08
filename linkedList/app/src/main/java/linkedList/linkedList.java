package linkedList;

public class linkedList<T> {
    Node head;

    public linkedList(){
        this.head = null;
    }
    /*
    this method should do Adds a new node with that value to the head of the list with an O(1) Time performance.
     */
public void insert(T v){
        Node newNode= new Node(v);
newNode.next=this.head;
    this.head = newNode;
}
/*
this method should do Indicates whether that value exists as a Node’s value somewhere within the list.
 */
public boolean includes(T v){
    Node pointer = this.head;
    boolean result;
    try{
while (pointer!=null){
 if(pointer.value ==v){

return  true;
 }
pointer=pointer.next;


}
    }

    catch (Exception exception){
        System.out.println(exception.toString());
    }
return false;
}
/*
* this method should return a string the is  formatted as this :
"{ a } -> { b } -> { c } -> NULL"
* */
public String toString1(){
    Node pointer = this.head;
    StringBuilder result = new StringBuilder();
try{while (pointer !=null){
     result.append('{').append(pointer.value).append("} ->");
     pointer=pointer.next;
    }result.append("null");
}catch (Exception exception){
    System.out.println(exception.toString());
}
return  result.toString();
}
   public void append(T v){
       Node pointer = this.head;
       while(pointer != null){
           if(pointer.next == null){
               Node newNode = new Node(v);
               pointer.next = newNode;
               newNode.next = null;
               break;
           }
           pointer = pointer.next;
       }
   }
    public void insertBefore(T v,T value){
       try{ Node pointer = this.head;
           while (pointer != null) {
               if (pointer.next.value == v) {
                   Node newNode = new Node(value);
                   newNode.next = pointer.next;
                   pointer.next = newNode;

                   break;
               }
               pointer = pointer.next;


           }}catch (Exception e){
           System.out.println(e.toString());
       }


    }
    public void insertAfter(T v,T value) {
    try {
        Node pointer = this.head;
        while (pointer != null) {
            pointer = pointer.next;
            if (pointer.next.value == v) {
                Node newNode = new Node(value);
                newNode.next = pointer.next;
                pointer.next = newNode;
                break;
            }
        }
    }catch (Exception e){

        System.out.println(e.toString());

    }

    }
}