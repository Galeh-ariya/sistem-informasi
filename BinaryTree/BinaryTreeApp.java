package pertemuan11;

public class BinaryTreeApp {
    Node root;

    public BinaryTreeApp(Node root) {
        this.root = null;
    }

    public BinaryTreeApp() {
    }

    void preorder(Node node) {
        if(node == null) {
            return;
        }

        System.out.println(node.data);
        preorder(node.kiri);
        preorder(node.kanan);
    }

    void inOrder(Node node) {
        if(node == null) {
            return;
        }

        inOrder(node.kiri);
        System.out.println(node.data);
        inOrder(node.kanan);
    }

    void postOrder(Node node) {
        if(node == null) {
            return;
        }

        postOrder(node.kiri);
        postOrder(node.kanan);
        System.out.println(node.data);
    }
}
