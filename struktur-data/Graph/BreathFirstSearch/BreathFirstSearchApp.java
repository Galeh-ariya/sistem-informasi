package pertemuan14.bfs;

public class BreathFirstSearchApp {
    public static void main(String[] args) {

        BreathFirstSearchTraversal graph = new BreathFirstSearchTraversal(10);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);
        graph.insertEdge(6, 5);
        graph.insertEdge(7, 5);
        graph.insertEdge(7, 8);

        System.out.println("Breat First Search Traversal");
        graph.BFS(3);


    }
}
