import java.util.*;
public class RomantoInt {
    public static int romanToInt(String s) {
        // Create a mapping of Roman numerals to their corresponding values
        HashMap<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        int result = 0;

        // Iterate through the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanToInteger.get(s.charAt(i));

            // If the current numeral is smaller than the next numeral, subtract it
            if (i < s.length() - 1 && currentVal < romanToInteger.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV"; // Replace with the Roman numeral you want to convert
        int integer = romanToInt(romanNumeral);
        System.out.println("The Roman numeral " + romanNumeral + " is equivalent to " + integer + " in integer form.");
    }
}
