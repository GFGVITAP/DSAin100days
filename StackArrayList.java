import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Stack implementation using ArrayList.
 */
public class StackArrayList {

    /**
     * Main method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        StackArrayList stack = new StackArrayList();
        assert stack.isEmpty();

        // Push elements to the top of this stack.
        for (int i = 1; i <= 5; ++i) {
            stack.push(i);
            assert stack.size() == i;
        }

        assert stack.size() == 5;
        assert stack.peek() == 5 && stack.pop() == 5 && stack.peek() == 4;

        // Pop elements from the top of this stack until it is empty.
        while (!stack.isEmpty()) {
            stack.pop();
        }
        assert stack.isEmpty();

        try {
            stack.pop();
            assert false;
            // Should not reach here
        } catch (EmptyStackException e) {
            assert true;
        }
    }

    // ArrayList to store stack elements.
    private ArrayList<Integer> stack;

    /**
     * Constructor
     */
    public StackArrayList() {
        stack = new ArrayList<>();
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param value the item to be pushed onto this stack.
     */
    public void push(int value) {
        stack.add(value);
    }

    /**
     * Removes the element at the top of this stack and returns that element.
     *
     * @return top of this stack.
     * @throws EmptyStackException if this stack is empty.
     */
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        // Remove last element from stack.
        return stack.remove(stack.size() - 1);
    }

    /**
     * Tests if this stack is empty.
     *
     * @return true if this stack is empty; false otherwise.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the element at the top of this stack without removing it from the stack.
     *
     * @return top of this stack.
     * @throws EmptyStackException if this stack is empty.
     */
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return size of this stack.
     */
    public int size() {
        return stack.size();
    }
}
