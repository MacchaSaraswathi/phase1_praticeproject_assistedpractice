package TryCatchBlock;

import java.util.Scanner;

public class TryCatchExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Code that may cause an exception
            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catch block for handling ArithmeticException
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block for handling other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Finally block, always executed (optional)
            System.out.println("Finally block executed.");
            scanner.close(); // Close the scanner in the finally block
        }
    }

    // Method to perform division and throw ArithmeticException if denominator is zero
    private static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}


