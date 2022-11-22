/*
 * This is the standard Main() class starting point.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2022-10-21
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* This is the starting of main program.
*/
final class Index {
    /**
     * Constant SPACESTRING variable.
     *
     */
    public static final String SPACESTRING = "\n";

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Index() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The main hourGlass function.
    *
    * @param userNum - number from user
    * @param spaces - spaces for hourGlass
    */
    static void hourGlass(final int userNum, final int spaces) {
        String tempString = "";
        for (int counter = 0; counter < spaces; counter++) {
            tempString += " ";
        }
        for (int counter1 = 0; counter1 < userNum; counter1++) {
            tempString += "* ";
        }
        System.out.println(tempString + SPACESTRING);
        if (userNum > 1) {
            hourGlass(userNum - 1, spaces + 1);
        }
        System.out.println(tempString + SPACESTRING);
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        try {
            final Scanner sc = new Scanner(System.in);
            System.out.print("Enter the hourglass length: ");
            final int userNumber = sc.nextInt();
            System.out.println("");
            hourGlass(userNumber, 0);
        } catch (InputMismatchException ex) {
            System.out.println("Input Invalid.");
        }
        System.out.println("\nDone.");
    }
}
