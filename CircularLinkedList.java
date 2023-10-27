public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteAtBeginning() {
        if (isEmpty()) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }

            tail = currentNode;
            tail.next = head;
        }
    }

    public void printList() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;

            if (currentNode == head) {
                break;
            }
        }

        System.out.println();
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
