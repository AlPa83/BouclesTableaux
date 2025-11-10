public class Job17 {

    // Method that creates an array of 10 integers and counts negatives, zeros, and positives
    public static void threeCounters() {
        // Create an array of 10 integers
        int[] numbers = {5, 7, -12, -9, 0, 45, 8, -13, -31, 15, 0};

        // Check if there are more than 10 elements
        if (numbers.length > 10) {
            System.out.println("Error: You can only have up to 10 numbers.");
            return;
        }

        // Initialize counters
        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;

        // Loop through the array to count each type of number
        for (int number : numbers) {
            if (number < 0) {
                negativeCount++;
            } else if (number == 0) {
                zeroCount++;
            } else {
                positiveCount++;
            }
        }

        // Display the results
        System.out.println("Number of negatives: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);
        System.out.println("Number of positives: " + positiveCount);
    }

    public static void main(String[] args) {
        threeCounters(); // Call the method
    }
}
