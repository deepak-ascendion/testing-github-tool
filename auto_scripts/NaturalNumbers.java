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
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println(); // New line after printing all numbers
        scanner.close();
    }
}