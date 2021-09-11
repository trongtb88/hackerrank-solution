import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CycleGraph {
    private int V;
    private List<List<Integer>> adj;

    public CycleGraph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<>());
        }


     }
    private boolean isCyclicUtil(int i, boolean [] visited, boolean [] recStack) {
        if (recStack[i]) {
            return true;
        }
        if (visited[i]) {
            return false;
        }
        visited[i] = true;
        recStack[i] = true;

        List<Integer> children = adj.get(i);

        for (Integer c: children)
            if (isCyclicUtil(c, visited, recStack))
                return true;

        recStack[i] = false;

        return false;

    }

    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }



    public static void main(String[] args) {
        int V = 5;
        CycleGraph graph = new CycleGraph(5);

        graph.addEdge(0, 1);
        //graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        //graph.addEdge(3, 3);


        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];


        // Call the recursive helper function to
        // detect cycle in different DFS trees
        for (int i = 0; i < V; i++)
            if (graph.isCyclicUtil(i, visited, recStack)) {
                System.out.println("is cyclic");
                return;
            }
    }

}
