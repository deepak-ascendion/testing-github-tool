public class AddNumbers {
    
    // Existing functionality - basic addition
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    // New HCF (Highest Common Factor) functionality for 4 numbers
    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    
    public static int hcf(int a, int b, int c) {
        return hcf(hcf(a, b), c);
    }
    
    public static int hcf(int a, int b, int c, int d) {
        return hcf(hcf(hcf(a, b), c), d);
    }
    
    // LCM (Least Common Multiple) functionality for completeness
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / hcf(a, b);
    }
    
    public static int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }
    
    public static int lcm(int a, int b, int c, int d) {
        return lcm(lcm(lcm(a, b), c), d);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test addition
        System.out.println("Addition of 2 numbers (5, 3): " + add(5, 3));
        System.out.println("Addition of 3 numbers (5, 3, 2): " + add(5, 3, 2));
        System.out.println("Addition of 4 numbers (5, 3, 2, 1): " + add(5, 3, 2, 1));
        
        // Test HCF
        System.out.println("HCF of 2 numbers (12, 8): " + hcf(12, 8));
        System.out.println("HCF of 3 numbers (12, 8, 4): " + hcf(12, 8, 4));
        System.out.println("HCF of 4 numbers (12, 8, 4, 16): " + hcf(12, 8, 4, 16));
        
        // Test LCM
        System.out.println("LCM of 2 numbers (4, 6): " + lcm(4, 6));
        System.out.println("LCM of 3 numbers (4, 6, 8): " + lcm(4, 6, 8));
        System.out.println("LCM of 4 numbers (4, 6, 8, 12): " + lcm(4, 6, 8, 12));
    }
}