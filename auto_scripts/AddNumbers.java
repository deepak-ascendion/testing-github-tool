public class AddNumbers {
    
    // Existing addition method
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method to calculate GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    // Method to calculate LCM (Least Common Multiple) of 2 numbers
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }
    
    // Overloaded method for long values to handle larger numbers
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd((int)a, (int)b);
    }
    
    public static void main(String[] args) {
        // Test addition
        System.out.println("Addition of 5 and 3: " + add(5, 3));
        
        // Test LCM
        System.out.println("LCM of 12 and 18: " + lcm(12, 18));
        System.out.println("LCM of 15 and 25: " + lcm(15, 25));
        System.out.println("LCM of 7 and 13: " + lcm(7, 13));
    }
}