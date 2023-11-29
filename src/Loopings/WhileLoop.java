package Loopings;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
        // Example 1: Simple while loop
        int count = 1;
        System.out.println("Example 1: Simple while loop");
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Example 2: while loop with user input
        System.out.println("\nExample 2: while loop with user input");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 to exit): ");
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            System.out.println("You entered: " + userInput);
            System.out.print("Enter a number (0 to exit): ");
            userInput = scanner.nextInt();
        }

        System.out.println("Exited the loop. Program complete.");
        scanner.close();
    }
}


