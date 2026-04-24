import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of odd numbers to print: ");
        int n = scanner.nextInt();
        
        System.out.println("First " + n + " odd numbers are:");
        
        int count = 0;
        int number = 1;
        
        while (count < n) {
            System.out.print(number + " ");
            number += 2;
            count++;
        }
        
        System.out.println();
        scanner.close();
    }
}