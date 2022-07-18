package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class TarjansAlgorithm {
    static int time;

    static void APUtil(LinkedList<Integer>[] adj, int u,
                       boolean visited[], int disc[], int low[],
                       int parent, boolean isAP[])
    {
        // Count of children in DFS Tree
        int children = 0;

        // Mark the current node as visited
        visited[u] = true;

        // Initialize discovery time and low value
        disc[u] = low[u] = ++time;

        // Go through all vertices adjacent to this
        Iterator<Integer> i = adj[u].listIterator();
        while (i.hasNext()) {
            int v = i.next();
            // If v is not visited yet, then make it a child of u
            // in DFS tree and recur for it
            if (!visited[v]) {
                children++;
                APUtil(adj, v, visited, disc, low, u, isAP);

                // Check if the subtree rooted with v has
                // a connection to one of the ancestors of u
                low[u] = Math.min(low[u], low[v]);

                // If u is not root and low value of one of
                // its child is more than discovery value of u.
                if (parent != -1 && low[v] >= disc[u])
                    isAP[u] = true;
            }

            // Update low value of u for parent function calls.
            else if (v != parent)
                low[u] = Math.min(low[u], disc[v]);
        }

        // If u is root of DFS tree and has two or more children.
        if (parent == -1 && children > 1)
            isAP[u] = true;
    }

    static void AP(LinkedList<Integer> adj[], int V)
    {
        //Keeps track of the nodes that are already visited.
        boolean[] visited = new boolean[V];
        // Keeps track of discovered time
        int[] disc = new int[V];
        //Keeps track of the value of the lowest ( node value ) node reachable while excluding the parent vertex.
        int[] low = new int[V];
        //Holds a boolean value for each node to denote whether it is true or false.
        boolean[] isAP = new boolean[V];
        int time = 0, par = -1;

     /*
     * Loop added so algorithm works even when the graph is more than one component.
     * */
        for (int u = 0; u < V; u++)
            if (visited[u] == false)
                APUtil(adj, u, visited, disc, low, par, isAP);

        for (int u = 0; u < V; u++)
            if (isAP[u] == true)
                System.out.print(u + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Creating first example graph
        int V = 5;
        Graph g = new Graph(V);

        g.addBidirectionalEdge(1,0);
        g.addBidirectionalEdge( 0, 2);
        g.addBidirectionalEdge(2, 1);
        g.addBidirectionalEdge( 0, 3);
        g.addBidirectionalEdge( 3, 4);
        System.out.println("Articulation points in the graph");
        AP(g.getAdjacencyList(), V);

    }


}
