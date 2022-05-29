package pertemuan10.DoubleLinkedList;


public class DoubelLinkedListImpl {
    NodeDouble head, tail = null;


    public void insertNode(String data) {
        NodeDouble node = new NodeDouble(data);

        if(head == null) {
            head = tail = node;
            head.setLinkPrev(null);
            tail.setLinkNext(null);
        }
        else {
            tail.setLinkNext(node);
            node.setLinkPrev(tail);

            tail = node;
            tail.setLinkNext(null);
        }
    }

    public void printNodes() {
        NodeDouble current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.getData() + " ");
            current = current.getLinkNext();
        }
    }
}

