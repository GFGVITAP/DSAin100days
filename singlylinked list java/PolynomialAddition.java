import java.util.Scanner;

// Node class to represent each term of the polynomial
class Node {
    int coefficient; // Coefficient of the term
    int exponent;    // Exponent of the term
    Node next;      // Pointer to the next term

    // Constructor to initialize a node with coefficient and exponent
    Node(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null; // Initially, next is null
    }
}

// Polynomial class to manage polynomial operations
class Polynomial {
    Node head; // Head of the polynomial linked list

    // Method to insert a term in the polynomial
    public void insertTerm(int coefficient, int exponent) {
        Node newNode = new Node(coefficient, exponent); // Create a new node
        if (head == null || head.exponent < exponent) { // Insert at the start
            newNode.next = head; // Link new node to current head
            head = newNode; // Update head to new node
            return; // Exit the method
        }
        Node current = head; // Start from the head
        Node previous = null; // To keep track of the previous node
        while (current != null && current.exponent >= exponent) { // Traverse to find position
            if (current.exponent == exponent) { // If exponent already exists
                current.coefficient += coefficient; // Add coefficients
                return; // Exit the method
            }
            previous = current; // Update previous node
            current = current.next; // Move to the next node
        }
        newNode.next = current; // Link new node to the next node
        previous.next = newNode; // Link previous node to the new node
    }

    // Method to add two polynomials
    public Polynomial add(Polynomial other) {
        Polynomial result = new Polynomial(); // Resultant polynomial
        Node current1 = this.head; // Start from the first polynomial
        Node current2 = other.head; // Start from the second polynomial

        // Traverse both polynomials
        while (current1 != null || current2 != null) {
            if (current1 == null) { // If the first polynomial is exhausted
                result.insertTerm(current2.coefficient, current2.exponent); // Insert remaining terms
                current2 = current2.next; // Move to the next term
            } else if (current2 == null) { // If the second polynomial is exhausted
                result.insertTerm(current1.coefficient, current1.exponent); // Insert remaining terms
                current1 = current1.next; // Move to the next term
            } else if (current1.exponent == current2.exponent) { // If exponents are equal
                int sumCoefficient = current1.coefficient + current2.coefficient; // Sum coefficients
                if (sumCoefficient != 0) { // Only add non-zero terms
                    result.insertTerm(sumCoefficient, current1.exponent);
                }
                current1 = current1.next; // Move to the next term
                current2 = current2.next; // Move to the next term
            } else if (current1.exponent > current2.exponent) { // Current term in the first polynomial has higher exponent
                result.insertTerm(current1.coefficient, current1.exponent); // Add term from the first polynomial
                current1 = current1.next; // Move to the next term
            } else { // Current term in the second polynomial has higher exponent
                result.insertTerm(current2.coefficient, current2.exponent); // Add term from the second polynomial
                current2 = current2.next; // Move to the next term
            }
        }
        return result; // Return the resultant polynomial
    }

    // Method to display the polynomial
    public void display() {
        if (head == null) {
            System.out.println("0"); // If the polynomial is empty
            return; // Exit the method
        }
        Node current = head; // Start from the head
        while (current != null) { // Traverse the linked list
            System.out.print(current.coefficient + "x^" + current.exponent); // Print term
            current = current.next; // Move to the next term
            if (current != null) {
                System.out.print(" + "); // Add plus sign between terms
            }
        }
        System.out.println(); // New line at the end
    }
}

// Main class to run the program
public class PolynomialAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner for input
        Polynomial poly1 = new Polynomial(); // First polynomial
        Polynomial poly2 = new Polynomial(); // Second polynomial

        // Input for first polynomial
        System.out.println("Enter terms for the first polynomial (coefficient and exponent, -1 to stop):");
        while (true) {
            System.out.print("Coefficient: ");
            int coefficient = scanner.nextInt(); // Read coefficient
            if (coefficient == -1) break; // Stop input if -1
            System.out.print("Exponent: ");
            int exponent = scanner.nextInt(); // Read exponent
            poly1.insertTerm(coefficient, exponent); // Insert term in the first polynomial
        }

        // Input for second polynomial
        System.out.println("Enter terms for the second polynomial (coefficient and exponent, -1 to stop):");
        while (true) {
            System.out.print("Coefficient: ");
            int coefficient = scanner.nextInt(); // Read coefficient
            if (coefficient == -1) break; // Stop input if -1
            System.out.print("Exponent: ");
            int exponent = scanner.nextInt(); // Read exponent
            poly2.insertTerm(coefficient, exponent); // Insert term in the second polynomial
        }

        // Display the polynomials
        System.out.println("First Polynomial: ");
        poly1.display();
        System.out.println("Second Polynomial: ");
        poly2.display();

        // Add the polynomials and display the result
        Polynomial result = poly1.add(poly2);
        System.out.println("Resultant Polynomial: ");
        result.display();

        scanner.close(); // Close the scanner
    }
}
