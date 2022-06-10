package tugastree;

public class TreeApp {
    public static void main(String[] args) {

        TreeService ts = new TreeService();
        ts.root = new Node('X');
        ts.root.prev = new Node('B');
        ts.root.prev.prev = new Node('C');
        ts.root.prev.next = new Node('I');
        ts.root.prev.next.prev = new Node('O');
        ts.root.prev.next.next = new Node('V');
        ts.root.down = new Node('R');
        ts.root.down.prev = new Node('K');
        ts.root.down.down = new Node('A');
        ts.root.down.down.prev = new Node('E');
        ts.root.down.down.next = new Node('N');
        ts.root.down.next = new Node('L');
        ts.root.next = new Node('M');
        ts.root.next.prev = new Node('P');
        ts.root.next.prev.prev = new Node('B');
        ts.root.next.prev.down = new Node('M');
        ts.root.next.prev.next = new Node('W');
        ts.root.next.next = new Node('T');

        System.out.print("Preorder => ");
        ts.preOrder(ts.root);
        System.out.println("");
        System.out.print("Inorder => ");
        ts.inOrder(ts.root);
        System.out.println("");
        System.out.print("Postorder => ");
        ts.postOrder(ts.root);




//        ts.root = new Node('X');
//        ts.root.left = new Node('B');
//        ts.root.left.left = new Node('C');
//        ts.root.left.right = new Node('I');
//        ts.root.left.right.left = new Node('O');
//        ts.root.left.right.right = new Node('V');
//        ts.root.right = new Node('R');
//        ts.root.right.left = new Node('K');
//        ts.root.right.right = new Node('A'); //*
//        ts.root.right.right.left = new Node('E');
//        ts.root.right.right.right = new Node('N');
//        ts.root.right.right = new Node('L'); //*
//        ts.root.right = new Node('M');
//        ts.root.right.left = new Node('P');
//        ts.root.right.left.left = new Node('B');
//        ts.root.right.left.right = new Node('M');
//        ts.root.right.left.right = new Node('W');
//        ts.root.right.right = new Node('P');
//
//        System.out.print("Preorder => ");
//        ts.preOrder(ts.root);
//        System.out.println("");
//        System.out.print("Inorder => ");
//        ts.inOrder(ts.root);
//        System.out.println("");
//        System.out.print("Postorder => ");
//        ts.postOrder(ts.root);


    }
}
