package pertemuan11;

public class TreeApp {
    public static void main(String[] args) {

        BinaryTreeApp treeApp = new BinaryTreeApp();

        treeApp.root = new Node(30);
        treeApp.root.kiri = new Node(3);
        treeApp.root.kanan = new Node(10);
        treeApp.root.kanan.kiri = new Node(5);
        treeApp.root.kanan.kanan = new Node(2);

        System.out.println("\n PreOrder");
        treeApp.preorder(treeApp.root);


        System.out.println("\n InOrder");
        treeApp.inOrder(treeApp.root);

        System.out.println("\n PostOrder");
        treeApp.postOrder(treeApp.root);

    }
}
