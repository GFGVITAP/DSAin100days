class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head, prev = null;
        // If the node to be deleted is the head node
        if (head.data == key) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            if (head == head.next) {
                head = null;
            } else {
                temp.next = head.next;
                head = head.next;
            }
        } else {
            while (curr.next != head && curr.data != key) {
                prev = curr;
                curr = curr.next;
            }
            if (curr.data == key) {
                prev.next = curr.next;
            } else {
                System.out.println("Element not found in the list");
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.insert(1);
        circularList.insert(2);
        circularList.insert(3);
        circularList.insert(4);

        System.out.println("Circular Linked List:");
        circularList.display();

        circularList.delete(3);

        System.out.println("Circular Linked List after deleting 3:");
        circularList.display();
    }
}
