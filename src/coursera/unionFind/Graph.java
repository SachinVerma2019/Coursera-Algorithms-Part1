package coursera.unionFind;

public class Graph {
    class Edge {
       public int src, dest;
    }
    private int V, E;
    Edge[] edge;
    Graph (int v, int e) {
        this.V = v;
        this.E = e;
        for (int i = 0; i < e ; i++) {
            edge[i] = new Edge();
        }
    }
    private int find (int [] parent, int i){
        if (parent[i] == -1){
            return i;
        }
       return find(parent, parent[i]);
    }
    void union (int [] parent, int x, int y){
        int xset = this.find(parent, x);
        int yset = this.find(parent, y);
        parent[xset] = yset;
    }
}
