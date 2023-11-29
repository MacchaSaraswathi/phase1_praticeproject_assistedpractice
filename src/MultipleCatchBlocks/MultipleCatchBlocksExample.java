package MultipleCatchBlocks;

import java.util.Scanner;

public class MultipleCatchBlocksExample {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Get two numbers from the user
	            System.out.print("Enter the numerator: ");
	            int numerator = scanner.nextInt();

	            System.out.print("Enter the denominator: ");
	            int denominator = scanner.nextInt();

	            // Call a method that may throw different exceptions
	            int result = divideNumbers(numerator, denominator);
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            // Handle ArithmeticException
	            System.out.println("ArithmeticException: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            // Handle NumberFormatException
	            System.out.println("NumberFormatException: " + e.getMessage());
	        } catch (Exception e) {
	            // Handle other exceptions
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            // Cleanup tasks or resource releases
	            System.out.println("Finally block executed.");
	            scanner.close();
	        }
	    }

	    // Method that may throw different exceptions
	    private static int divideNumbers(int numerator, int denominator) {
	        if (denominator == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }

	        try {
	            // Simulating a situation where a NumberFormatException may occur
	            String invalidInput = "ABC";
	            @SuppressWarnings("unused")
				int parsedNumber = Integer.parseInt(invalidInput);
	            return numerator / denominator;
	        } catch (NumberFormatException e) {
	            // Catching NumberFormatException within the method
	            throw new NumberFormatException("Invalid input format: " + e.getMessage());
	        }
	    }

}
