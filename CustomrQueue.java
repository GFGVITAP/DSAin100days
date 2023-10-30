public class CustomrQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void enqueue(int customerID) {
        Node newNode = new Node(customerID);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        CustomrQueue q = new CustomrQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Intial Queue");

        q.print();
        q.dequeue();
        q.dequeue();
        System.out.println("Queue after two customers are serviced");
        q.print();

        q.enqueue(4);
        q.dequeue();
        q.dequeue();
        System.out.println("Queue after one new customer joins in and two customers are serviced");
        q.print();

        System.out.println("Size of queue=>"+q.size());

    }
}
