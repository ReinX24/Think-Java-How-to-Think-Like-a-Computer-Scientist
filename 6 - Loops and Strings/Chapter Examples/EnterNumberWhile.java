import java.util.Scanner;

public class EnterNumberWhile {

    public static void main(String[] args) {

        Scanner scanOne = new Scanner(System.in); // Scanner to accept user input

        System.out.print("Enter a number: ");

        while (!scanOne.hasNextDouble()) { // if the input is not a double

            String userInput = scanOne.next(); // stores invalid input here
            System.err.println(userInput + " is not a number");
            System.out.print("Enter a number: ");

            // while loop will keep looping until input is a number (double in this case)

        }

        double userNum = scanOne.nextDouble(); // accepts user input if it is a double
        System.out.println("User Number: " + userNum);

        scanOne.close(); // closes the Scanner

    }

}
