import java.util.Scanner;

// Node class represents each element in the linked list
class Node {
    int data; // Data part of the node
    Node next; // Pointer to the next node

    // Constructor to initialize node with data
    Node(int data) {
        this.data = data;
        this.next = null; // Initially, next is null
    }
}

// SinglyLinkedList class to manage the linked list operations
class SinglyLinkedList {
    Node head; // Head of the list

    // Method to insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) { // If the list is empty
            head = newNode; // Set head to new node
            return; // Exit the method
        }
        Node current = head; // Start from the head
        while (current.next != null) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Link the last node to new node
    }

    // Method to insert a new node at the start of the list
    public void insertAtStart(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Link new node to the current head
        head = newNode; // Update head to the new node
    }

    // Method to insert a new node at a specified position
    public void insertAtPosition(int data, int position) {
        if (position <= 0) { // If position is less than or equal to 0
            System.out.println("Position must be greater than 0.");
            return; // Exit the method
        }
        if (position == 1) { // If inserting at the head
            insertAtStart(data); // Reuse the insertAtStart method
            return; // Exit the method
        }
        Node newNode = new Node(data); // Create a new node
        Node current = head; // Start from the head
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next; // Traverse to the specified position
        }
        if (current == null) { // If position is greater than the list length
            System.out.println("Position is out of bounds.");
            return; // Exit the method
        }
        newNode.next = current.next; // Link new node to the next node
        current.next = newNode; // Link current node to the new node
    }

    // Method to delete a node from the start of the list
    public void deleteFromStart() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty, cannot delete.");
            return; // Exit the method
        }
        head = head.next; // Move head to the next node
    }

    // Method to delete a node from the end of the list
    public void deleteFromEnd() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty, cannot delete.");
            return; // Exit the method
        }
        if (head.next == null) { // If there is only one node
            head = null; // Set head to null
            return; // Exit the method
        }
        Node current = head; // Start from the head
        while (current.next.next != null) { // Traverse to the second last node
            current = current.next; // Move to the next node
        }
        current.next = null; // Remove the last node
    }

    // Method to delete a node at a specified position
    public void deleteFromPosition(int position) {
        if (head == null) { // If the list is empty
            System.out.println("List is empty, cannot delete.");
            return; // Exit the method
        }
        if (position <= 0) { // If position is less than or equal to 0
            System.out.println("Position must be greater than 0.");
            return; // Exit the method
        }
        if (position == 1) { // If deleting the head
            head = head.next; // Move head to the next node
            return; // Exit the method
        }
        Node current = head; // Start from the head
        Node previous = null; // To keep track of the previous node
        for (int i = 1; i < position && current != null; i++) {
            previous = current; // Update previous node
            current = current.next; // Move to the next node
        }
        if (current == null) { // If position is greater than the list length
            System.out.println("Position is out of bounds.");
            return; // Exit the method
        }
        previous.next = current.next; // Bypass the current node
    }

    // Method to display the linked list
    public void display() {
        Node current = head; // Start from the head
        if (current == null) {
            System.out.println("The list is empty."); // Check if the list is empty
            return; // Exit the method
        }
        while (current != null) { // Traverse the list
            System.out.print(current.data + " -> "); // Print data
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate end of the list
    }
}

// Main class to run the program
public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner for input
        SinglyLinkedList list = new SinglyLinkedList(); // Create an instance of the linked list
        int choice; // Variable to store menu choice

        // Menu-driven loop
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at End");
            System.out.println("2. Insert at Start");
            System.out.println("3. Insert at nth Position");
            System.out.println("4. Delete from Start");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete from nth Position");
            System.out.println("7. Print LinkedList");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read user choice

            switch (choice) {
                case 1: // Insert at end
                    System.out.print("Enter value to insert: ");
                    int valueToInsertEnd = scanner.nextInt(); // Read value to insert
                    list.insertAtEnd(valueToInsertEnd); // Call insert method
                    break;
                case 2: // Insert at start
                    System.out.print("Enter value to insert: ");
                    int valueToInsertStart = scanner.nextInt(); // Read value to insert
                    list.insertAtStart(valueToInsertStart); // Call insert method
                    break;
                case 3: // Insert at nth position
                    System.out.print("Enter value to insert: ");
                    int valueToInsertPosition = scanner.nextInt(); // Read value to insert
                    System.out.print("Enter position: ");
                    int positionToInsert = scanner.nextInt(); // Read position
                    list.insertAtPosition(valueToInsertPosition, positionToInsert); // Call insert method
                    break;
                case 4: // Delete from start
                    list.deleteFromStart(); // Call delete method
                    break;
                case 5: // Delete from end
                    list.deleteFromEnd(); // Call delete method
                    break;
                case 6: // Delete from nth position
                    System.out.print("Enter position: ");
                    int positionToDelete = scanner.nextInt(); // Read position
                    list.deleteFromPosition(positionToDelete); // Call delete method
                    break;
                case 7: // Print linked list
                    list.display(); // Call display method
                    break;
                case 8: // Exit
                    System.out.println("Exiting the program.");
                    break;
                default: // Invalid choice
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 8); // Continue until user chooses to exit

        scanner.close(); // Close the scanner
    }
}
