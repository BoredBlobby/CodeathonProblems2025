package boredBlobby;


import java.util.Scanner;

public class markovChain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer 'n'
        int n = scanner.nextInt();

        // Consume the leftover newline character from the input buffer
        scanner.nextLine();

        // Loop 'n' times
        for (int i = 0; i < n; i++) {
            // Read the name
            String myText = scanner.nextLine();

        }

        // Close the scanner to release system resources
        scanner.close();
    }

    class markovWord {
        private String[] myWords;
        private int myHash;

        public markovWord(String[] source, int start, int size) {
            myWords = new String[size];
        }
    }
}
