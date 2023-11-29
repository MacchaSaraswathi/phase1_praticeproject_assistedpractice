package ThrowandThrowsKeywords;

import java.io.IOException;

public class ThrowsExample {
	public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // Method that declares it may throw IOException
    private static void readFile(String fileName) throws IOException {
        // Code that may throw IOException
        // For example, attempting to read from a file
        throw new IOException("File not found: " + fileName);
    }
}


