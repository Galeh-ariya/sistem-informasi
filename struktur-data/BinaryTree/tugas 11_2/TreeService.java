package tugastree;

public class TreeService {
    Node root;

    public TreeService() {
    }

    void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.symbol + " ");
        preOrder(node.prev);
        preOrder(node.down);
        preOrder(node.next);
    }

    void inOrder(Node node) {
        if(node == null) {
            return;
        }

        inOrder(node.prev);
        System.out.print(node.symbol + " ");
        inOrder(node.down);
        inOrder(node.next);
    }

    void postOrder(Node node) {
        if(node == null) {
            return;
        }

        postOrder(node.prev);
        postOrder(node.down);
        postOrder(node.next);
        System.out.print(node.symbol + " ");
    }

}
