# Challenge Summary
create a method that is counts how to match travel from a city to another by Graph<br />

## Whiteboard Process
![image](./image37.png)

## Approach & Efficiency
O(1) for space<br />
O(n^2) for time 

## Solution
create node(vertex) for c1 and c2 and c3<br />
do the relation addEdge for c1 and c2 and c3 <br />
create array of cities that have the relation node <br /> 
then call the method by the name of method <br />
example :    <br />
graph.addVertex("c1");<br />
graph.addVertex("c2");<br />
graph.addVertex("C3");<br />

graph.addEdge("c1","c2",10);<br />
graph.addEdge("c2","c3",30);<br />
String []city={c1,c3}<br />
graph.businessTrip(graph,city);<br /> 
