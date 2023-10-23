class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {
    private Node head;

    // Add element to the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add element to the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add element at any given position in the linked list
    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                if (temp == null) {
                    System.out.println("Invalid position");
                    return;
                }
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Remove element from the beginning of the linked list
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Remove element from the end of the linked list
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Remove element from any given position in the linked list
    public void removeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                if (temp == null || temp.next == null) {
                    System.out.println("Invalid position");
                    return;
                }
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.addFirst(1);
        list.addLast(2);
        list.addAtPosition(3, 2);
        list.printList();

        list.removeFirst();
        list.removeLast();
        list.removeAtPosition(1);
        list.printList();

        list.addFirst(5);
        list.addLast(6);
        list.printList();

        list.reverse();
        list.printList();
    }
}
