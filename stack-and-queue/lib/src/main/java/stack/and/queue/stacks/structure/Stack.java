package stack.and.queue.stacks.structure;

import stack.and.queue.stacks.data.StackNode;

import java.util.EmptyStackException;

public class Stack {
    private StackNode top;

    public Stack() {
        this.top = null;
    }

public boolean isEmpty(){


        return top==null;
}
public String push(StackNode a){
if (isEmpty()){
    top=a;
    return a.getName();
}else {
    a.setNext(top);
    top=a;
    return a.getName();
}

}
public String pop(){
    StackNode pointer;
        if (isEmpty()){

            throw  new EmptyStackException();

        }
        else {
pointer=top;
top=top.getNext();

        }
    return top.getName();
}
    public StackNode peek(){
if (isEmpty()){

    throw new EmptyStackException();

}

return top;

    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
