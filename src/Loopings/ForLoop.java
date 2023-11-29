package Loopings;

import java.util.Scanner;

public class ForLoop {
	 public static void main(String[] args) {
	        // Example 1: Simple for loop
	        System.out.println("Example 1: Simple for loop");
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Count: " + i);
	        }

	        // Example 2: for loop with user input
	        System.out.println("\nExample 2: for loop with user input");
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of times to repeat the loop: ");
	        int repeatCount = scanner.nextInt();

	        for (int i = 1; i <= repeatCount; i++) {
	            System.out.println("Iteration: " + i);
	        }

	        // Example 3: Nested for loop (multiplication table)
	        System.out.println("\nExample 3: Nested for loop (multiplication table)");
	        for (int i = 1; i <= 10; i++) {
	            for (int j = 1; j <= 10; j++) {
	                System.out.print(i * j + "\t");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }

}
