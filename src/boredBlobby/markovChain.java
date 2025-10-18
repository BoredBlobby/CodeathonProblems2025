/* The markov chain should read the number of testcases. For each testcase, it should
* replace the newlines with a space stopping after the "roadblack." Then it should
* use the text as training text to generate a random text of whatever length"
* 
* Author: Preston Chang
* version: 0.1
*/

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
            int seed = scanner.nextInt();
            String name = scanner.nextLine();

        }

        // Close the scanner to release system resources
        scanner.close();
    }


    /* Creates a Markov Word model that uses an array of words as the training text.
     * The order of the Markov model is specified by the 'order' parameter.
     */
    public class markovWord implements IMarkovModel {
        private String[] myWords;
        private Random myRandom;
        private int myOrder;

        public markovWord(String[] source, int start, int size) {
            myWords = new String[size];
        }

        public void setRandom(int seed) {
            myRandom = new Random(seed);
        }

        public String getRandomText(int numWords) { //Not finished
            StringBuilder sb = new StringBuilder();
            return sb.toString().trim();
        }

        public void setTraining(String text) {
            myWords = text.split("\\s+");
        }
    }

    public interface IMarkoveModel {
        public void setTraining(String text);

        public void setRandom(int seed);

        public String getRandomText(int numWords);
    }
}
