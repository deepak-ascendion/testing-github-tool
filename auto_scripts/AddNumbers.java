/**
 * AddNumbers class with enhanced string reversal functionality
 * Updated to include multiple reverseString methods
 */
public class AddNumbers {
    
    // Method to add two integers
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to reverse a string using character array approach
    public String reverseString(String input) {
        if (input == null) {
            return null;
        }
        if (input.isEmpty()) {
            return input;
        }
        
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        
        return new String(chars);
    }
    
    // Alternative method to reverse a string using StringBuilder
    public String reverseStringBuilder(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return new StringBuilder(input).reverse().toString();
    }
    
    // Test method
    public static void main(String[] args) {
        AddNumbers calculator = new AddNumbers();
        
        // Test addition
        int result = calculator.addNumbers(10, 20);
        System.out.println("Addition result: " + result);
        
        // Test string reversal methods
        String original = "Hello World";
        String reversed1 = calculator.reverseString(original);
        String reversed2 = calculator.reverseStringBuilder(original);
        
        System.out.println("Original: " + original);
        System.out.println("Reversed (method 1): " + reversed1);
        System.out.println("Reversed (method 2): " + reversed2);
    }
}