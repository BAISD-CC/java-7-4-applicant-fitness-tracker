import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrackerPanel {
    // Create a static method named fileOpener that has a string parameter for the filename and throws a FileNotFoundException.
        
        // Create a File object that accepts the filename as an argument.
        // Create a Scanner object that accepts the File object as an argument.

        // Create a double array for average steps in each month (12 months).
        // Create an int array for the number of days in each month (e.g., 31 for January, 28 for February, etc.).
        // Create an int variable to track the current month number.
        // Create an int to hold the total steps for the current month.
        // Create an int to count the number of days in the current month.

        // Loop through the file using the Scanner object:
            // Get the current line.
            // Convert the line (a string) to an integer representing the number of steps.
            // Add the steps to the total steps for the current month.
            // Increment the day count for the current month.

            // If the day count reaches the number of days in the current month:
                // Calculate the average steps for the current month.
                // Store the calculated average in the double array.
                // Reset the total steps and day count for the next month.
                // Move to the next month by incrementing the month number.

        // Create a string variable to hold the output.

        // Create a string array for the names of the months (e.g., "January", "February", etc.).

        // Loop through the months and append the output string with:
        // "Average steps for [Month Name]: [Average Steps]".
        
        // Return the final output string.

    public static void main(String[] args) throws FileNotFoundException {
        // Call the fileOpener method with "steps.txt" and print the result to the console.

        // Close the program.
    }
}
