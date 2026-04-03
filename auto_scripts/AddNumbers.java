/**
 * AddNumbers class with string reversal functionality
 * Updated to include reverseString method
 */
public class AddNumbers {
    
    // Method to add two integers
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to reverse a string - NEW FUNCTIONALITY
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
    
    // Test method
    public static void main(String[] args) {
        AddNumbers calculator = new AddNumbers();
        
        // Test addition
        int result = calculator.addNumbers(10, 20);
        System.out.println("Addition result: " + result);
        
        // Test string reversal
        String original = "Hello World";
        String reversed = calculator.reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}