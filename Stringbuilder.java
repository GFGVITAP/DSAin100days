
public class Stringbuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        // Append a string to the StringBuilder
        sb.append("Hello, World!");

        // Insert a string at a specific index
        sb.insert(5, " ");

        // Replace a substring with another string
        sb.replace(12, 17, " everyone!");

        // Get the string representation of the StringBuilder
        String str = sb.toString();

        // Print the string
        System.out.println(str);
    }
}
