package coursera.unionFind;

public class QuickUnionUF {
    private int []id;
    public QuickUnionUF(int N) {
        id = new int [N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    boolean connected (int p, int q) {
        return root(p) == root(q);
    }
    private int root (int i) {
        while (i != id[i]) i = id[i];
        return i;
    }
    public void union (int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
