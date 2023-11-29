package TryBlockWithParameters;

import java.util.Scanner;

public class TryBlockWithParameters {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get two numbers from the user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Call a method that may throw an exception
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle the specific exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Cleanup tasks or resource releases
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }

    // Method that may throw an ArithmeticException
    private static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }

}
