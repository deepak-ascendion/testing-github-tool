public class AddNumbers {
    
    // Existing functionality - basic addition
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    // New HCF functionality for 4 numbers
    public int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int hcf(int a, int b, int c) {
        return hcf(hcf(a, b), c);
    }
    
    public int hcf(int a, int b, int c, int d) {
        return hcf(hcf(hcf(a, b), c), d);
    }
    
    // LCM functionality (using HCF)
    public int lcm(int a, int b) {
        return Math.abs(a * b) / hcf(a, b);
    }
    
    public int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }
    
    public int lcm(int a, int b, int c, int d) {
        return lcm(lcm(lcm(a, b), c), d);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        AddNumbers calculator = new AddNumbers();
        
        // Test addition
        System.out.println("Addition of 10, 20: " + calculator.add(10, 20));
        System.out.println("Addition of 10, 20, 30: " + calculator.add(10, 20, 30));
        System.out.println("Addition of 10, 20, 30, 40: " + calculator.add(10, 20, 30, 40));
        
        // Test HCF
        System.out.println("HCF of 12, 18: " + calculator.hcf(12, 18));
        System.out.println("HCF of 12, 18, 24: " + calculator.hcf(12, 18, 24));
        System.out.println("HCF of 12, 18, 24, 36: " + calculator.hcf(12, 18, 24, 36));
        
        // Test LCM
        System.out.println("LCM of 4, 6: " + calculator.lcm(4, 6));
        System.out.println("LCM of 4, 6, 8: " + calculator.lcm(4, 6, 8));
        System.out.println("LCM of 4, 6, 8, 12: " + calculator.lcm(4, 6, 8, 12));
    }
}