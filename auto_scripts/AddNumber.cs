using System;

public class AddNumbers
{
    // Method to add two numbers
    public int AddTwoNumbers(int a, int b)
    {
        return a + b;
    }

    // Method to add multiple numbers
    public int AddMultipleNumbers(params int[] numbers)
    {
        int sum = 0;
        foreach (int num in numbers)
        {
            sum += num;
        }
        return sum;
    }

    // Method to reverse a string
    public string ReverseString(string input)
    {
        if (string.IsNullOrEmpty(input))
            return input;

        char[] chars = input.ToCharArray();
        Array.Reverse(chars);
        return new string(chars);
    }

    // Main method for testing
    public static void Main(string[] args)
    {
        AddNumbers obj = new AddNumbers();

        Console.WriteLine("Sum of 2 + 3: " + obj.AddTwoNumbers(2, 3));
        Console.WriteLine("Sum of multiple numbers: " + obj.AddMultipleNumbers(1, 2, 3, 4));

        string original = "hello";
        string reversed = obj.ReverseString(original);
        Console.WriteLine("Reversed string: " + reversed);
    }
}
