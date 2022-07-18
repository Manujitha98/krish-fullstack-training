package Graphs;

import java.util.LinkedList;

public class Graph {

    private int vertices;
    private LinkedList<Integer> adjacencyList[];

    Graph(int v)
    {
        this.vertices = v;
        this.adjacencyList = new LinkedList[v];

        //Initialize each vertex with an adjacency list.
        for(int i=0;i<vertices;++i)
            this.adjacencyList[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        //Creates a directed graph as the relationship is not bidirectional.
        adjacencyList[v].add(w);
    }

    void addBidirectionalEdge(int v, int w){
        adjacencyList[v].add(w);
        adjacencyList[w].add(v);

    }

    int getVertices(){
        return vertices;
    }

    LinkedList<Integer>[] getAdjacencyList(){
        return adjacencyList;
    }

}
