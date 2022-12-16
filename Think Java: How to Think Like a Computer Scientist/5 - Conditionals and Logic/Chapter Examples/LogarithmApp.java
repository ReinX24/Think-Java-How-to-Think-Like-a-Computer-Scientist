import java.util.Scanner;

public class LogarithmApp {

    public static void main(String[] args) {

        // Accept user input
        Scanner scanOne = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Checks if the input is a number or not
        if (!scanOne.hasNextDouble()) {

            String misInput = scanOne.next(); // stores user input in misInput
            System.err.println(misInput + " is not a number"); // showing error message
            scanOne.close(); // closes the Scanner before terminating the program
            return; // returns to main, terminates the program

        }

        // Check if number is greater than 0
        double myNum = scanOne.nextDouble(); // will instantiate a variable if input is a double

        if (myNum > 0) {

            double numLog = Math.log(myNum); // calculates the logarithm of the inputted number
            System.out.println("The log is: " + numLog);

        }

        else {

            System.out.println("Log is undefined");

        }

        // Close the Scanner
        scanOne.close();

    }

}
