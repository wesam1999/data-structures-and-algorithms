package stack.and.queue.queue.structure;

import stack.and.queue.queue.data.QueueNode;
import stack.and.queue.queue.structure.Interface.QueueInterface;

public class AnimalShelter  {



    public void enqueue(QueueNode animal) {
if (animal.getName()=="cat"||animal.getName()=="dog"){

Queue queueNode=new Queue();
queueNode.enqueue(animal);
}
else {
    System.out.println("the animal not equal cat or dog");
}
    }


    public String dequeue(QueueNode pref) {


        if (pref.getName()=="cat"||pref.getName()=="dog"){
            Queue queue=new Queue();
            return  queue.dequeue();

        }


        return null;
    }
}
