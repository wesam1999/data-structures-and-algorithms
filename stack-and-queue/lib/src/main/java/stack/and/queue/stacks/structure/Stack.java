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
public StackNode push(StackNode a){
if (isEmpty()){
    top=a;
    return a;
}else {
    a.setNext(top);
    top=a;
    return a;
}

}
public StackNode pop(){
    StackNode pointer;
        if (isEmpty()){

            throw  new EmptyStackException();

        }
        else {
pointer=top;
top=top.getNext();

        }
    return top;
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
