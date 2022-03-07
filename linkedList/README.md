# Singly Linked List
it is about how to create a link list and node in side it.

## Challenge
Node<br />
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.<br />
Linked List<br />
Create a Linked List class<br />
Within your Linked List class, include a head property.<br />
Upon instantiation, an empty Linked List should be created.<br />
The class should contain the following methods<br />
insert<br />
Arguments: value<br />
Returns: nothing<br />
Adds a new node with that value to the head of the list with an O(1) Time performance.<br />
includes<br />
Arguments: value<br />
Returns: Boolean<br />
Indicates whether that value exists as a Node’s value somewhere within the list.<br />
to string<br />
Arguments: none<br />
Returns: a string representing all the values in the Linked List, formatted as:<br />
"{ a } -> { b } -> { c } -> NULL"<br />
Any exceptions or errors that come from your code should be semantic, capture-able errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.<br />
Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).<br />

## Approach & Efficiency
 What approach did you take? Why? 
What is the Big O space/time for this approach?
 insert:<br />
O(1) Time/space<br />
 includes:<br />
O(N)time /space<br />
 toString1:<br />
 O(N)time /space<br />
## API
insert:<br />
it is method take value and create it like node then insert it in first of the link list .<br />
includes:<br />
it is method take value and return boolean if it is true if the link list is includes the value and false then the value does not includes .<br />
toString1:<br />
this method should return a string the is  formatted as this :<br />
"{ a } -> { b } -> { c } -> NULL"<br />
linkedList:<br />
this method create link list have it header and next value equal null.