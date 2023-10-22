import java.util.*;

class Graph {
    private int V;
    private int graph[][];

    Graph(int v) {
        V = v;
        graph = new int[v][v];
    }

    void addEdge(int src, int dest, int weight) {
        graph[src][dest] = weight;
    }

    void dijkstra(int src) {
        int dist[] = new int[V];
        boolean sptSet[] = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
            }
        }

        // Print the constructed distance array
        for (int i = 0; i < V; i++)
            System.out.println("Shortest distance from source to " + i + " is: " + dist[i]);
    }

    int minDistance(int dist[], boolean sptSet[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void main(String args[]) {
        Graph g = new Graph(5);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 3, 5);
        g.addEdge(1, 2, 4);
        g.addEdge(1, 3, 2);
        g.addEdge(2, 4, 1);
        g.addEdge(3, 2, 3);
        g.addEdge(3, 4, 7);

        System.out.println("Shortest distances from source vertex 0:");
        g.dijkstra(0);
    }
}
