package stack.and.queue.queue.structure;

import stack.and.queue.queue.data.QueueNode;
import stack.and.queue.stacks.data.StackNode;

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
    public QueueNode enqueue(QueueNode a){
        if (isEmpty()){
            front=a;
            back=a;
            size++;
            return a;
        }else {
            a.setNext(back);
            size++;
            return a;
        }

    }
    public QueueNode dequeue(){
QueueNode frontT;
        if (isEmpty()){

            throw  new NoSuchElementException("we have a empty queue");

        }
        else {

            frontT=front;
            front=front.getNext();
            size--;

        }
        return frontT;
    }
    public QueueNode peek(){
        if (isEmpty()){

            throw new EmptyStackException();

        }

        return front;

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
