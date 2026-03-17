public class AddNumbers {
    
    // Existing method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Existing method to add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Existing method to add four numbers
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    // NEW: Method to find GCD/HCF of two numbers using Euclidean algorithm
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // NEW: Method to find HCF of three numbers
    public int hcf(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }
    
    // NEW: Method to find HCF of four numbers
    public int hcf(int a, int b, int c, int d) {
        int hcfAB = gcd(a, b);
        int hcfABC = gcd(hcfAB, c);
        return gcd(hcfABC, d);
    }
    
    // NEW: Method to find LCM of two numbers
    public int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }
    
    // NEW: Method to find LCM of three numbers
    public int lcm(int a, int b, int c) {
        return lcm(lcm(a, b), c);
    }
    
    // NEW: Method to find LCM of four numbers
    public int lcm(int a, int b, int c, int d) {
        return lcm(lcm(lcm(a, b), c), d);
    }
    
    public static void main(String[] args) {
        AddNumbers calculator = new AddNumbers();
        System.out.println("Addition of 10, 20: " + calculator.add(10, 20));
        System.out.println("HCF of 12, 18, 24, 36: " + calculator.hcf(12, 18, 24, 36));
        System.out.println("LCM of 4, 6, 8, 12: " + calculator.lcm(4, 6, 8, 12));
    }
}