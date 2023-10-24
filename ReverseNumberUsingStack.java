import java.util.Stack;

public class ReverseNumberUsingStack {
    public static void main(String[] args) {
        int number = 12345; // Change this number to reverse a different number
        int reversedNumber = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        Stack<Integer> stack = new Stack<>();
        
        // Push digits of the number onto the stack
        while (number != 0) {
            int digit = number % 10;
            stack.push(digit);
            number /= 10;
        }

        // Pop digits from the stack to form the reversed number
        int reversedNumber = 0;
        int multiplier = 1;
        while (!stack.isEmpty()) {
            reversedNumber += stack.pop() * multiplier;
            multiplier *= 10;
        }

        return reversedNumber;
    }
}
