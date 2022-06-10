package tugastree;

public class Node {
    char symbol;
    Node prev, next, down;

    public Node(char symbol) {
        this.symbol = symbol;
        this.prev = null;
        this.next = null;
        this.down = null;
    }
}
