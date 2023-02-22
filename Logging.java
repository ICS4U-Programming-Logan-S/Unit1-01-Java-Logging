import java.util.Scanner;

/**
* This program asks the user for a length of logs
* and calculates the amount of logs a truck can
* carry based on the length.
*
* @author  Logan S
* @version 1.0
* @since   2023-2-16
*/
public final class Logging {

    /**
     * This is a private constructor.
     *
     *
     * @exception IllegalStateException Added a Utility class.
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {

        // Constants
        final double logWeight = 20.0;
        final double maxMass = 1100.0;
        final double sizeOne = 0.25;
        final double sizeTwo = 0.5;
        final double sizeThree = 1.0;

        // Using Scanner for Getting Input for User
        final Scanner scanner = new Scanner(System.in);

        // Gets input from user
        System.out.print("Enter log length (0.25, 0.5, 1): ");
        final String length = scanner.nextLine();

        try {
            // Convert string to a double
            final double lengthD = Double.parseDouble(length);

            // If input is valid calculates # of logs.
            if (lengthD == sizeOne || lengthD == sizeTwo
                     || lengthD == sizeThree) {
                // Calculate # of logs
                final double numLogs = logWeight * lengthD;
                final double logsFinal = maxMass / numLogs;

                // Display the answer to user
                System.out.print("The truck can take, " + logsFinal);
                System.out.print(" logs that are " + length);
                System.out.println(" meters in length");
            } else {
                System.out.println("Invalid length. Try again!");
            }
        } catch (NumberFormatException error) {
            System.out.println("Invalid length - "
                    + error.getMessage());
        }
        scanner.close();
    }
}
