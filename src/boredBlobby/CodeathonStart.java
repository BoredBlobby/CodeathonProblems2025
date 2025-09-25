package boredBlobby;

// File name: CodeathonStart.java
// This is the first problem in the problemset.

// Author: Omar Ahmad

import java.util.Scanner;

public class CodeathonStart {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the integer 'n'
        int n = scanner.nextInt();

        // Consume the leftover newline character from the input buffer
        scanner.nextLine();

        // Loop 'n' times
        for (int i = 0; i < n; i++) {
            // Read the name
            String name = scanner.nextLine();

            // Print the welcome message using string concatenation
            System.out.println("Welcome to the CodeAThon, " + name + "!");
        }

        // Close the scanner to release system resources
        scanner.close();
    }
}
