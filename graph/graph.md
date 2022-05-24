## Graphs
In math, a graph can be defined as a pictorial representation or a diagram that represents data or values in an organized manner.<br /> 
The points on the graph often represent the relationship between two or more things.<br />

## Challenge
add node<br />
Arguments: value<br />
Returns: The added node<br />
Add a node to the graph<br />
add edge<br />
Arguments: 2 nodes to be connected by the edge, weight (optional)<br />
Returns: nothing<br />
Adds a new edge between two nodes in the graph<br />
If specified, assign a weight to the edge<br />
Both nodes should already be in the Graph<br />
get nodes<br />
Arguments: none<br />
Returns all of the nodes in the graph as a collection (set, list, or similar)<br />
get neighbors<br />
Arguments: node<br />
Returns a collection of edges connected to the given node<br />
Include the weight of the connection in the returned collection<br />
size<br />
Arguments: none<br />
Returns the total number of nodes in the graph<br />

## Approach & Efficiency
add node<br />
O(1)for space <br />
O(1)for time<br />
add edge<br />
O(n)for space <br />
O(1) for time <br />
get nodes<br />
O(1)for space and time<br />
get neighbors<br />
O(n)for space <br />
O(1)for time<br />
size<br />
O(1)for space and time<br />

## API
add node<br />
method that add Vertex to the Graph<br />
add edge<br />
 method that add relation between two Vertex<br />
get nodes<br />
get all the nodes we have it in the Graph<br />
get neighbors<br />
get al the edges connected and add weight of connected to the array list  <br />
size<br />
get the number of the key we have in graph<br />