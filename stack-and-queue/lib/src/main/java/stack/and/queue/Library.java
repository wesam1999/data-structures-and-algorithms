/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import stack.and.queue.stacks.data.StackNode;
import stack.and.queue.stacks.structure.Stack;

public class Library {
    public static void main(String[] args) {
        System.out.println("--------- that is for Stacks and queue----------");
        Stack stack=new Stack();
if (stack.isEmpty()){
    System.out.println("this stack is empty");

}

        stack.push(new StackNode("wesam","23213-321983213-232"));
        stack.push(new StackNode("ali","2321s2133-7982"));
        stack.push(new StackNode("kaled","232432413-32139879213-232"));
        stack.push(new StackNode("frede","236546213-3213-0=-213-232"));
        stack.push(new StackNode("wdsad","78876-79-2309802"));
        System.out.println(stack.toString());
    }
}
