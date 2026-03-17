public class AddNumbers {
    
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add four numbers
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    // Method to find GCD/HCF of two numbers
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    // Method to find HCF of three numbers
    public int hcf(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }
    
    // Method to find HCF of four numbers
    public int hcf(int a, int b, int c, int d) {
        return gcd(gcd(gcd(a, b), c), d);
    }
    
    // Method to find LCM of two numbers
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    // Method to find LCM of three numbers
    public int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }
    
    // Method to find LCM of four numbers
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
        System.out.println("HCF of 12, 18, 24: " + calculator.hcf(12, 18, 24));
        System.out.println("HCF of 12, 18, 24, 36: " + calculator.hcf(12, 18, 24, 36));
        
        // Test LCM
        System.out.println("LCM of 4, 6, 8: " + calculator.lcm(4, 6, 8));
        System.out.println("LCM of 4, 6, 8, 12: " + calculator.lcm(4, 6, 8, 12));
    }
}