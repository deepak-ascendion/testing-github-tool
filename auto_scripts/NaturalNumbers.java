import java.util.Scanner;

public class NaturalNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        System.out.println("First " + n + " natural numbers are:");
        
        // Method 1: Using for loop
        printUsingForLoop(n);
        
        System.out.println();
        
        // Method 2: Using while loop
        printUsingWhileLoop(n);
        
        scanner.close();
    }
    
    /**
     * Print natural numbers using for loop
     * @param n - number of natural numbers to print
     */
    public static void printUsingForLoop(int n) {
        System.out.println("Using For Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     * Print natural numbers using while loop
     * @param n - number of natural numbers to print
     */
    public static void printUsingWhileLoop(int n) {
        System.out.println("Using While Loop:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}