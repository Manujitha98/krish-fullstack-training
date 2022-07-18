package Graphs;

/**
 * @Author Manujitha Perera
 * Referencing GeeksforGeeks.com writer Aakash Hasija
 */
import java.util.Iterator;
import java.util.LinkedList;

class GraphBFS {

    void BFS(int source, int vertices , LinkedList<Integer> adjacencyList[]){
        boolean visited[] = new boolean[vertices];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] =true;
        queue.add(source);

        while(queue.size()!=0){
            source = queue.poll();
            System.out.print(source + " ");

            Iterator<Integer> i =adjacencyList[source].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }

        }
    }

    public static void main(String[] args) {

        Graph g = new Graph(4);
        GraphBFS gBFS = new GraphBFS();

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        LinkedList<Integer> adjacencyList[] = g.getAdjacencyList();
        int vertices = g.getVertices();
        int sourceNode = 2;

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        gBFS.BFS(sourceNode,vertices,adjacencyList);
    }


}