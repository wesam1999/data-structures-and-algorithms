package stack.and.queue.queue.structure;

import stack.and.queue.queue.data.QueueNode;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue {

    private QueueNode front;
    private QueueNode back;
private final  int size_Queue=10;
private int size;
public Queue() {
       size=0;
    }
    public boolean isEmpty(){


        return front==null;
    }
    public String enqueue(QueueNode a){
        if (isEmpty()){
            front=a;
            back=a;
            size++;
            return a.getName();
        }else if (size< size_Queue){
            a.setNext(back);
            size++;
            return a.getName();
        }
return a.getName()  ;
    }
    public String dequeue(){
QueueNode frontT;
        if (isEmpty()){

            throw  new NoSuchElementException("we have a empty queue");

        }
        else {

            frontT=front;
            front=front.getNext();
            size--;

        }
        return frontT.getName();
    }
    public String peek(){
        if (isEmpty()){

            throw new EmptyStackException();

        }

        return front.getName();

    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                ", size=" + size +
                '}';
    }
}
