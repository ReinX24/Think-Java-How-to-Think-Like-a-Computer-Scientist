import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        /*
         * When comparing Strings, one should use the .equals method rather than ==
         * 
         */

        Scanner scanOne = new Scanner(System.in);

        System.out.println("Would you like to know more?");
        System.out.print("> ");
        String userAns = scanOne.nextLine(); // stores user input

        if (userAns.equals("yes")) { // checks if user input is "yes"

            System.out.println("Great! Let's go!");

        }

        else { // if input is not yes, run code block below

            System.out.println("Goodbye!");

        }

        scanOne.close(); // closes the Scanner

    }

}
