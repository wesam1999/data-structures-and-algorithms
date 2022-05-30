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
    public void addEdge(String data1, String data2, int weight) {
        Vertex wVertex1 = new Vertex(data1, weight);
        Vertex wVertex2 = new Vertex(data2, weight);

        Vertex vertex1 = new Vertex(data1, weight);
        Vertex vertex2 = new Vertex(data2, weight);

        adjVertices.get(vertex1).add(wVertex2);
        adjVertices.get(vertex2).add(wVertex1);
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




    public Set<String> bfs(Graph graph,String root){
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()){
            String vertex = queue.poll();
            for(Vertex v : graph.getAdjVertices(vertex)){
                if(!visited.contains((v.data)))
                {
                    queue.add(v.data);
                    visited.add(v.data);

                }
            }
        }
        return visited;
    }
    public List<Vertex> getAdjVertices(String data){
        return adjVertices.get(new Vertex(data));
    }
    public void graph_business_trip(Graph graph,String []city){

int total=0;


        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        for (){



        }


    }

}
