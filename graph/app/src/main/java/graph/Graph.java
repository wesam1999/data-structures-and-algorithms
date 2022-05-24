package graph;

import java.util.*;

public class Graph {

    private Map<Vertex,List<Vertex>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public void addVertex(String data) {
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex,new ArrayList<>());
    }

    public void addEdges(String data1,String data2){
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    String printGraph() {
        StringBuilder strBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            strBuilder.append(vertex);
            strBuilder.append(adjVertices.get(vertex));
        }

        return strBuilder.toString();
    }

    public void removeVertex(String data){
        Vertex vertex = new Vertex(data);
        adjVertices.values().forEach(list -> list.remove(vertex));
        adjVertices.remove(vertex);

    }

    public void removeEdge(String data1,String data2){
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        List<Vertex> edgeList1 = adjVertices.get(vertex1);
        List<Vertex> edgList2 = adjVertices.get(vertex2);

        if(!edgeList1.isEmpty()) {
            edgeList1.remove(vertex2);
        }

        if(!edgList2.isEmpty()) {
            edgList2.remove(vertex1);
        }
    }
    public Set get_nodes(){
        Set nodes=adjVertices.keySet();

return nodes;

    }
public List<Vertex> get_neighbors(Vertex vertex){
    List<Vertex> number = adjVertices.get(vertex);

    String data= String.valueOf(number.size());
    Vertex vertex1=new Vertex(data);
//    System.out.println(
    number.add(vertex1);
return number;
}
public int size(){
  return adjVertices.size();
}

}
