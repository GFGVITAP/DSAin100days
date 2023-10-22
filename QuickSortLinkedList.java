class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QuickSortLinkedList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node getTail(Node node) {
        while (node != null && node.next != null) {
            node = node.next;
        }
        return node;
    }

    public Node partition(Node low, Node high) {
        int pivot = high.data;
        Node i = low;
        for (Node j = low; j != high; j = j.next) {
            if (j.data < pivot) {
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
                i = i.next;
            }
        }
        int temp = i.data;
        i.data = high.data;
        high.data = temp;
        return i;
    }

    public void quickSort(Node low, Node high) {
        if (low != null && high != null && low != high && low != high.next) {
            Node pivot = partition(low, high);
            quickSort(low, pivot);
            quickSort(pivot.next, high);
        }
    }

    public void sort() {
        Node tail = getTail(head);
        quickSort(head, tail);
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSortLinkedList list = new QuickSortLinkedList();
        list.addNode(12);
        list.addNode(8);
        list.addNode(10);
        list.addNode(5);
        list.addNode(1);
        list.addNode(6);

        System.out.println("Linked List before sorting:");
        list.printList();

        list.sort();

        System.out.println("Linked List after sorting:");
        list.printList();
    }
}
