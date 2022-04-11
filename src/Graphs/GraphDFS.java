package Graphs;
import java.util.*;
/**
 * @Author Manujitha Perera
 * Referencing GeeksforGeeks.com writer Aakash Hasija
 */

class GraphDFS {

    // A function used by DFS
    void DFSUtil(int v, boolean visited[], LinkedList<Integer> adjacencyList[])
    {
        // Prints current node and marks it as visited in the boolean array.
        visited[v] = true;
        System.out.print(v + " ");

        // Recursively call the Util function for all unvisited nodes.
        Iterator<Integer> i = adjacencyList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited, adjacencyList);
        }
    }

    //Helper function that calls the recursive DFS util function. It also initialized the visted boolean array.
    void DFS(int sourceVertex, int vertices, LinkedList<Integer> adjacencyList[])
    {
        boolean visited[] = new boolean[vertices];
        DFSUtil(sourceVertex, visited, adjacencyList);
    }
    public static void main(String args[])
    {
        Graph g = new Graph(5);
        GraphDFS gDFS = new GraphDFS();

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        LinkedList<Integer> adjacencyList[] = g.getAdjacencyList();
        int vertices = g.getVertices();
        int sourceVertex = 2;

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        gDFS.DFS(sourceVertex, vertices, adjacencyList);
    }
}

