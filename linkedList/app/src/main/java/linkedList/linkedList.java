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
                newNode.next = pointer.next.next;
                pointer.next.next = newNode;
                break;
            }
        }
    }catch (Exception e){

        System.out.println(e.toString());

    }

    }
    public String kthFromEnd(int k){
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of k is not more than length of
        // the linked list
        if (len < k)
            return "Exception";

        temp = head;

        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - k + 1; i++)
            temp = temp.next;

       return (String) temp.value;

}
    static Node reverseList(Node head)
    {

        if (head.next == null)
            return head;

        Node rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }
public Node zip_lists(Node a, Node b){

// Reverse Linked List 'a'
    a = reverseList(a);

    // Reverse Linked List 'b'
    b = reverseList(b);

    // Initialize head of resultant list
    Node head = null;

    Node temp;

    // Traverse both lists while both of them
    // have nodes.
    while (a != null && b != null) {

        // If a's current value is greater than or equal to
        // b's current value.
        if (a.key >= b.key) {

            // Store next of current Node in first list
            temp = a.next;

            // Add 'a' at the front of resultant list
            a.next = head;

            // Make 'a' - head of the result list
            head = a;

            // Move ahead in first list
            a = temp;
        }

        // If b's value is greater. Below steps are similar
        // to above (Only 'a' is replaced with 'b')
        else {

            temp = b.next;
            b.next = head;
            head = b;
            b = temp;
        }
    }

    // If second list reached end, but first list has
    // nodes. Add remaining nodes of first list at the
    // beginning of result list
    while (a != null) {

        temp = a.next;
        a.next = head;
        head = a;
        a = temp;
    }

    // If first list reached end, but second list has
    // nodes. Add remaining nodes of second list at the
    // beginning of result list
    while (b != null) {

        temp = b.next;
        b.next = head;
        head = b;
        b = temp;
    }

    // Return the head of the result list
    return head;
////    Node dummy = new Node();
////    Node tail = dummy;
////
////    while (true)
////    {
////        // empty list cases
////        if (a == null)
////        {
////            tail.next = b;
////            break;
////        }
////
////        else if (b == null)
////        {
////            tail.next = a;
////            break;
////        }
////
////        // common case: move two nodes to the tail
////        else {
////            tail.next = a;
////            tail = a;
////            a = a.next;
////
////            tail.next = b;
////            tail = b;
////            b = b.next;
////        }
//    }
//
//    return dummy.next;

    }
    // Method for reversing the linked list
    Node<T> reverse(linkedList<T> node) {
        Node<T> pointer = node.head;
       Node<T> curr = pointer;
        Node<T> nex = null;
        Node<T> prev = null;
        linkedList<T> newLinklist=null ;
        while (curr != null) {
            nex= curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;

//            newLinklist.insert((T) prev);
//          pointer=pointer.next;

        }


       return prev;
    }



}