// Existing code in AddNumbers.java
public class AddNumbers {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 12;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Check if num1 is divisible by 3
        if (num1 % 3 == 0) {
            System.out.println(num1 + " is divisible by 3");
        } else {
            System.out.println(num1 + " is not divisible by 3");
        }

        // Check if num2 is divisible by 3
        if (num2 % 3 == 0) {
            System.out.println(num2 + " is divisible by 3");
        } else {
            System.out.println(num2 + " is not divisible by 3");
        }
    }
}
