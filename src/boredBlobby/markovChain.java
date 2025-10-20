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
    // source: text to train on
    // start: where to start in source
    // size: how many words to include
        public markovWord(int order) {
            myRandom = new Random();
            myOrder = order;
        }

        public void setRandom(int seed) {
            myRandom = new Random(seed);
        }

        public void setTraining(String text) {
            myWords = text.split("\\s+");
        }

        /*Gnerates random text with the specified number of words */
        public String getRandomText(int numWords) { //Not finished; uses getFollows and indexOf
            StringBuilder sb = new StringBuilder();
            return sb.toString().trim();
        }

        private int indexOf(String[] words, String target, int start) {
            for (int k = start; k < words.length; k++) {
                WordGram wg = new WordGram(words, k, target.length());
                if (words[k].equals(target)) {
                    return k;
                }
            }
            return -1;
        }
    }

    public interface IMarkoveModel {
        public void setTraining(String text);

        public void setRandom(int seed);

        public String getRandomText(int numWords);
    }

    public class WordGram {
        private String[] myWords;
        private int myHash;

        public WordGram(String[] words, int index, int size) {
            myWords = new String[size];
            System.arraycopy(words, index, myWords, 0, size);
        }
    }
}
