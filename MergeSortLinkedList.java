class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortLinkedList {
    Node head;

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return merge(left, right);
    }

    public Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node a, Node b) {
        Node result = null;

        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        if (a.data <= b.data) {
            result = a;
            result.next = merge(a.next, b);
        } else {
            result = b;
            result.next = merge(a, b.next);
        }

        return result;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();
        list.addNode(12);
        list.addNode(8);
        list.addNode(10);
        list.addNode(5);
        list.addNode(1);
        list.addNode(6);

        System.out.println("Linked List before sorting:");
        list.printList(list.head);

        list.head = list.mergeSort(list.head);

        System.out.println("Linked List after sorting:");
        list.printList(list.head);
    }
}
