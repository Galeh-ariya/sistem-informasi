package tugas112;

public class BinaryTreeApp {
    public static void main(String[] args) {

        BinaryTreeService treeApp = new BinaryTreeService();

        treeApp.root = new Node('X');
        treeApp.root.left = new Node('B');
        treeApp.root.right = new Node('R');
        treeApp.root.left.left = new Node('C');
        treeApp.root.left.right = new Node('I');
        treeApp.root.left.right.left = new Node('O');
        treeApp.root.left.right.right = new Node('V');
        treeApp.root.right.left = new Node('K');
        treeApp.root.right.right = new Node('A');




        System.out.println("\n Preorder");
        treeApp.preOrder(treeApp.root);

        System.out.println("\n InOrder");
        treeApp.inOrder(treeApp.root);

        System.out.println("\n PostOrder");
        treeApp.postOrder(treeApp.root);

    }
}
