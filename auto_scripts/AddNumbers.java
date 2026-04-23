public class AddNumbers {
    
    // Existing addition function
    public static int add(int a, int b) {
        return a + b;
    }
    
    // New multiplication function
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // Function to multiply specific numbers 4 and 7
    public static int multiplyFourAndSeven() {
        return multiply(4, 7);
    }
    
    public static void main(String[] args) {
        // Test addition
        System.out.println("Addition of 5 and 3: " + add(5, 3));
        
        // Test multiplication
        System.out.println("Multiplication of 4 and 7: " + multiplyFourAndSeven());
        System.out.println("Result: " + multiplyFourAndSeven());
    }
}