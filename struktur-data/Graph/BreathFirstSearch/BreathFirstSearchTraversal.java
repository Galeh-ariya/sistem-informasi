package pertemuan14.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearchTraversal {
    private int vertex;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;

    public BreathFirstSearchTraversal(int vertex){
        this.vertex = vertex;
        adj = new LinkedList[this.vertex];

        for(var i = 0; i < vertex; i++) {
            adj[i] = new LinkedList<>();
        }
        this.queue = new LinkedList<>();
    }

    public void insertEdge(int vertex, int w) {
        adj[vertex].add(w);
    }

    public void BFS(int n) {
        boolean[] nodes = new boolean[this.vertex];
        int a = 0;
        nodes[n] = true;
        this.queue.add(n);

        while (this.queue.size() != 0) {
            n = this.queue.poll();
            System.out.print(n + " ");

            for(int i = 0; i < this.adj[n].size(); i++) {
                a = this.adj[n].get(i);

                if(!nodes[a]) {
                    nodes[a] = true;
                    this.queue.add(a);
                }
            }
        }

    }
}
