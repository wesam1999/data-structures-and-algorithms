package graph;

import java.util.Objects;

public class Vertex {

    String data=null;
    public int weight;

    public Vertex(String data) {
        this.data = data;
    }
    public Vertex(String data, int weight) {
        this.data =data;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data='" + data + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(data, vertex.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

}
