public class AddNumbers {
    
    // Existing functionality (preserved)
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // New HCF (Highest Common Factor) functionality for 3 numbers
    public static int hcf(int a, int b, int c) {
        return hcf(hcf(a, b), c);
    }
    
    // Helper method to find HCF of two numbers using Euclidean algorithm
    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }
    
    // Alternative method using absolute values to handle negative numbers
    public static int hcfAbsolute(int a, int b, int c) {
        return hcf(Math.abs(a), Math.abs(b), Math.abs(c));
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test addition functionality
        System.out.println("Addition of 5 and 3: " + add(5, 3));
        System.out.println("Addition of 5, 3, and 2: " + add(5, 3, 2));
        
        // Test HCF functionality
        System.out.println("HCF of 12, 18, and 24: " + hcf(12, 18, 24));
        System.out.println("HCF of 48, 18, and 24: " + hcf(48, 18, 24));
        System.out.println("HCF of 100, 75, and 50: " + hcf(100, 75, 50));
    }
}