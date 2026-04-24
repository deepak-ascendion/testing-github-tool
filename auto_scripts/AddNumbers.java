public class AddNumbers {
    
    // Existing addition functionality
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    // Method to add multiple numbers
    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    // New multiplication function as requested
    public static int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }
    
    // Specific method to multiply 2 and 10 as requested
    public static int multiplyTwoAndTen() {
        return multiplyTwoNumbers(2, 10);
    }
    
    public static void main(String[] args) {
        // Test addition functions
        System.out.println("Addition of 5 and 3: " + addTwoNumbers(5, 3));
        System.out.println("Addition of multiple numbers (1,2,3,4,5): " + addNumbers(1, 2, 3, 4, 5));
        
        // Test multiplication functions
        System.out.println("Multiplication of 2 and 10: " + multiplyTwoNumbers(2, 10));
        System.out.println("Specific multiplication of 2 and 10: " + multiplyTwoAndTen());
    }
}