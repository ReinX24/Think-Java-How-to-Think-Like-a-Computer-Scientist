import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        /*
         * Prompt the user to input integers for a, b, and c. Compute the two solutions
         * for x, and display the results. (Done)
         * 
         * Your program should be able to handle inputs for which there is only one or
         * no solution. Specifically, it should not divide by zero or take the square
         * root of a negative number. (Done)
         * 
         * Be sure to validate all inputs. The user should never see an input mismatch
         * exception. Display specific error messages that include the invalid input.
         * (Done)
         * 
         */

        // Input integers a, b, and c
        Scanner scanOne = new Scanner(System.in);

        System.out.println("[Quadratic Equation Program]");

        System.out.print("Input a: ");

        if (!scanOne.hasNextFloat()) { // if the user inputs an invalid input

            System.out.println("[Invalid Input]");
            scanOne.close();
            return; // terminates the program

        }

        float numA = scanOne.nextFloat(); // float to accept decimals, a variable

        System.out.print("Input b: ");

        if (!scanOne.hasNextFloat()) { // if the user inputs an invalid input

            System.out.println("[Invalid Input]");
            scanOne.close();
            return; // terminates the program

        }

        float numB = scanOne.nextFloat(); // b variable

        System.out.print("Input c: ");

        if (!scanOne.hasNextFloat()) { // if the user inputs an invalid input

            System.out.println("[Invalid Input]");
            scanOne.close();
            return; // terminates the program

        }

        float numC = scanOne.nextFloat(); // c variable

        // Solve for the quadratic formula using the inputted numbers

        // where we will store our answers
        float numPosX; // positive
        float numNegX; // negative

        if (2 * numA == 0) {

            System.err.println("Cannot Divide by 0"); // error message when divisor is equal to 0
            scanOne.close(); // closes Scanner before terminating the program
            return; // terminates the program

        }

        else if ((Math.pow(numB, 2) - 4 * numA * numC) < 0) {

            System.err.println("Cannot Find Square Root of a Negative Number");
            // error message when trying to find the square root of a negative number
            scanOne.close();
            return; // terminates the program

        }

        numB = numB * -1; // converts positive number into a negative number
        numPosX = (float) (numB + Math.sqrt(Math.pow(numB, 2) - 4 * numA * numC) / 2 * numA); // add square root
        numNegX = (float) (numB - Math.sqrt(Math.pow(numB, 2) - 4 * numA * numC) / 2 * numA); // subtract square root

        System.out.println("Answers: " + numPosX + " | " + numNegX); // prints the answers

        scanOne.close(); // closes the Scanner

    }

}