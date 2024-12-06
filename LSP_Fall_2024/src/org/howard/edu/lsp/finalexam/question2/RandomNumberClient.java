package org.howard.edu.lsp.finalexam.question2;

/**
 * Client class demonstrating the use of RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    /**
     * Main method to run the demonstration.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Get the singleton instance of RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // Demonstrate Java's built-in random number generator
        service.setStrategy(new JavaRandomStrategy());
        System.out.println("Java Random: " + service.getRandomNumber());

        // Demonstrate custom LCG random number generator
        service.setStrategy(new LCGRandomStrategy());
        System.out.println("LCG Random: " + service.getRandomNumber());
    }
}