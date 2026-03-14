// Existing code
public class AddNumbers {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 15;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        // Check if num1 and num2 are divisible by 3
        if (num1 % 3 == 0 && num2 % 3 == 0) {
            System.out.println("Both numbers are divisible by 3.");
        } else if (num1 % 3 == 0) {
            System.out.println("First number is divisible by 3.");
        } else if (num2 % 3 == 0) {
            System.out.println("Second number is divisible by 3.");
        } else {
            System.out.println("Neither number is divisible by 3.");
        }
    }
}
