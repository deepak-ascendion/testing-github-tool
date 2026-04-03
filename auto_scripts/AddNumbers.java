public class AddNumbers {
    
    // Method to add two numbers
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    // Method to add three numbers
    public int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to reverse a string
    public String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        return reversed.toString();
    }
    
    // Alternative method to reverse a string using StringBuilder
    public String reverseStringAlternative(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        return new StringBuilder(input).reverse().toString();
    }
    
    // Main method for testing
    public static void main(String[] args) {
        AddNumbers calculator = new AddNumbers();
        
        // Test addition methods
        System.out.println("Sum of 5 and 3: " + calculator.addTwoNumbers(5, 3));
        System.out.println("Sum of 1, 2, and 3: " + calculator.addThreeNumbers(1, 2, 3));
        
        // Test string reversal methods
        String testString = "Hello World";
        System.out.println("Original string: " + testString);
        System.out.println("Reversed string: " + calculator.reverseString(testString));
        System.out.println("Reversed string (alternative): " + calculator.reverseStringAlternative(testString));
    }
}