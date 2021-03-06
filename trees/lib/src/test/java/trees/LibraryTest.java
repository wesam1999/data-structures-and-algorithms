/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;
import trees.data.Node;
import trees.structure.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
@Test
   public void fizzBuzz(){
    BinarySearchTree binarySearchTree=new BinarySearchTree();
    Node node=new Node(12);
    node.setLeftNode(new Node(12));
    node.setRightNode(new Node(33));
    node.getLeftNode().setLeftNode(new Node(55));
//    System.out.println(binarySearchTree.extractValues(node));
//    System.out.println(binarySearchTree.fizzBuzz(binarySearchTree.extractValues(node)));

//    String[] array = {"Buzz", "Fizz", "Fizz", "Fizz"};
    List<String> array=new ArrayList<>();
    array.add("Buzz");
    array.add("Fizz");
    array.add("Fizz");
    array.add("Fizz");


   assertEquals(array,binarySearchTree.fizzBuzz(binarySearchTree.extractValues(node)));


}
}
