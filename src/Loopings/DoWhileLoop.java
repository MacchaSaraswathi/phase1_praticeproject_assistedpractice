package Loopings;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
        // Example 1: Simple do-while loop
        int count = 1;
        System.out.println("Example 1: Simple do-while loop");
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        // Example 2: do-while loop with user input
        System.out.println("\nExample 2: do-while loop with user input");
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Enter a number (0 to exit): ");
            userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } while (userInput != 0);

        System.out.println("Exited the loop. Program complete.");
        scanner.close();
    }

}
