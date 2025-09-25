package boredBlobby;

import java.util.HashMap;
import java.util.Scanner;

public class CodonFinder {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the integer 'n'
        int n = scanner.nextInt();

        // Consume the leftover newline character from the input buffer
        scanner.nextLine();

        CodonFinder cf = new CodonFinder();

        // Loop 'n' times
        for (int i = 0; i < n; i++) {
            // Read the DNA strand
            String dnaStrand = scanner.nextLine();

            // Print results
            String gene = cf.findSimpleGene(dnaStrand);
            String maxCodon = cf.MaxCodon(dnaStrand);

            System.out.println("Most Frequent Codon: " + maxCodon);

        }

        // Close the scanner to release system resources
        scanner.close();
    }

    public String findSimpleGene(String dnaStrand) {
        int startIndex = dnaStrand.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dnaStrand.indexOf("TAA", startIndex + 3);
        while (stopIndex != -1) {
            if ((stopIndex - startIndex) % 3 == 0) {
                return dnaStrand.substring(startIndex, stopIndex + 3);
            } else {
                stopIndex = dnaStrand.indexOf("TAA", stopIndex + 1);
            }
        }
        return "";
    }

    public String MaxCodon(String dnaStrand) {
        HashMap<String, Integer> codonList = new HashMap<>();
        String maxCodon = "";
        int maxCount = 0;

        // Step through the DNA in chunks of 3
        for (int i = 0; i + 3 <= dnaStrand.length(); i += 3) {
            String codon = dnaStrand.substring(i, i + 3);
            codonList.put(codon, codonList.getOrDefault(codon, 0) + 1);

            // Track the most frequent codon
            if (codonList.get(codon) > maxCount) {
                maxCount = codonList.get(codon);
                maxCodon = codon;
            }
        }

        return maxCodon.isEmpty() ? "No codons" : maxCodon + " (" + maxCount + ")";
    }
}
