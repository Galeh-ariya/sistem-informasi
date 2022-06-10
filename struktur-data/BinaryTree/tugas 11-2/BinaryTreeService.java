package tugas112;

public class BinaryTreeService {
    Node root;

    public BinaryTreeService() {
    }

    void preOrder(Node node) {
        if(node == null) {
            return;
        }

        System.out.print(node.symbol + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node) {
        if(node == null) {
            return;
        }

        preOrder(node.left);
        System.out.print(node.symbol + " ");
        preOrder(node.right);
    }

    void postOrder(Node node) {
        if(node == null) {
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.symbol + " ");
    }


}
