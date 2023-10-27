public class StackUsingArray {
     int maxSize; 	// Maximum size of the stack
     int top;     	// Index of the top element in the stack
    int[] stack; 	// Array to store stack elements
    // Constructor to initialize the stack with a given size
    public StackUsingArray(int size) {
        maxSize = size;
        top = -1; 		
        stack = new int[maxSize];
    }
    // Method to push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element: " + value);
            return;
        }
        stack[++top] = value; //updates the value of top before using it.
    }
 // Method to pop an element from the stack
    public int pop() {
        if (top==-1) {
            System.out.println("Stack is empty. Cannot pop an element.");
            return -1; // Return a sentinel value to indicate an empty stack
        }
        return stack[top--];
    }
public int peek() {
        if (top==-1) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an empty stack
        }
        return stack[top];
    }
     public void printStack()
      {
        for(int i=top;i>-1;i--)
	{
          System.out.println(stack[i]);
}       }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
	stack.push(4);
        stack.push(5);
        System.out.println("Before pop:");
stack.printStack();
System.out.println("Top element: " + stack.peek());
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
	System.out.println("After pop:");
stack.printStack();
        }    }
