package FinallyBlock;

import java.util.Scanner;

public class FinallyBlockExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Code that may throw an exception
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Display the result of a division
            System.out.println("Result: " + divideByTwo(number));
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Cleanup tasks or resource releases in the finally block
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }

    // Method that may throw an ArithmeticException
    private static int divideByTwo(int number) {
        if (number == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return number / 2;
    }

}
