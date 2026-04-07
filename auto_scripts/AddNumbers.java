package auto_scripts;

public class AddNumbers {
    public int add(int a, int b) {
        return a + b;
    }

    // Method to reverse a string
    public String reverseString(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}