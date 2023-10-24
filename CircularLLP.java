class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLLP {
    private Node head;

    // ... (insert, delete, and display methods here)

    public boolean isPalindrome() {
        if (head == null) {
            return true;
        }

        // Step 1: Find the middle of the circular linked list
        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the circular linked list
        Node secondHalf = slow.next;
        slow.next = null;
        Node prev = null, current = secondHalf, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;

        // Step 3: Compare the first and reversed second half
        Node firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Reconstruct the original circular linked list (optional)
        // slow.next = reverse(secondHalf);

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLLP circularList = new CircularLLP();
        circularList.insert(1);
        circularList.insert(2);
        circularList.insert(3);
        circularList.insert(2);
        circularList.insert(1);

        System.out.println("Is the circular linked list a palindrome? " + circularList.isPalindrome());
    }
}
