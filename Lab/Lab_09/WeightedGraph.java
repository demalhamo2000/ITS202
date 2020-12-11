import java.util.LinkedList;

public class WeightedGraph {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<Edge> [] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int src, int dest, int weight) {
            Edge edge = new Edge(src, dest, weight);
            adjacencylist[src].addFirst(edge); //for directed graph
        }
       public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).dest + " with weight " +  list.get(j).weight);
                }
            }
        }
    }
      public static void main(String[] args) {
            int vertices = 5;
            Graph graph = new Graph(vertices);
            graph.addEgde(0, 2, 4);
            graph.addEgde(0, 1, 3);
            graph.addEgde(1, 5, 1);
            graph.addEgde(2, 3, 2);
           
            graph.printGraph();
        }
}