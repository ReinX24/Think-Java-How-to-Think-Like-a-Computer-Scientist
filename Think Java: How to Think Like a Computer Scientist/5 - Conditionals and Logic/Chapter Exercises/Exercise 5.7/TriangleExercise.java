import java.util.Scanner;

public class TriangleExercise {

    public static void main(String[] args) {

        /*
         * If you are given three sticks, you may or may not be able to arrange them in
         * a triangle. For example, if one of the sticks is 12 inches long and the other
         * two are 1 inch long, you will not be able to get the short
         * sticks to meet in the middle.
         * 
         * For any three lengths, there is a simple test to see if it is possible to
         * form a triangle:
         * 
         * If any of the three lengths is greater than the sum of the other two, you
         * cannot form a triangle. (Done)
         * 
         * Write a program named Triangle.java that inputs three integers, and then
         * outputs whether you can (or cannot) form a triangle from the given lengths.
         * Reuse your code from the previous exercise to validate the inputs. Display an
         * error if any of the lengths are negative or zero. (Done)
         * 
         */

        Scanner scanOne = new Scanner(System.in);

        System.out.println("[Triangle Exercise ]");

        System.out.print("Input length a: ");

        if (!scanOne.hasNextFloat()) { // if the user inputs an invalid input

            System.out.println("[Invalid Input]");
            scanOne.close();
            return; // terminates the program

        }

        float numA = scanOne.nextFloat(); // float to accept decimals, a variable

        // After accepting the user input, check if any of the lengths are negative or
        // less than 0
        if (numA <= 0) { // checks length A

            System.out.println("[Lengths cannot be a 0 or a negative number]");
            scanOne.close();
            return;

        }

        System.out.print("Input length b: ");

        if (!scanOne.hasNextFloat()) { // if the user inputs an invalid input

            System.out.println("[Invalid Input]");
            scanOne.close();
            return; // terminates the program

        }

        float numB = scanOne.nextFloat(); // b variable

        if (numB <= 0) { // checks length B

            System.out.println("[Lengths cannot be a 0 or a negative number]");
            scanOne.close();
            return;

        }

        System.out.print("Input length c: ");

        if (!scanOne.hasNextFloat()) { // if the user inputs an invalid input

            System.out.println("[Invalid Input]");
            scanOne.close();
            return; // terminates the program

        }

        float numC = scanOne.nextFloat(); // c variable

        if (numC <= 0) { // checks length C

            System.out.println("[Lengths cannot be a 0 or a negative number]");
            scanOne.close();
            return;

        }

        /*
         * If any of the three lengths is greater than the sum of the other two, you
         * cannot form a triangle.
         */

        if (numA > (numB + numC)) { // checks if each length is longer than the sum of the other two

            System.out.println("[Cannot make a triangle, Length A is too long]");

        }

        else if (numB > (numA + numC)) {

            System.out.println("[Cannot make a triangle, Length B is too long]");

        }

        else if (numC > (numA + numB)) {

            System.out.println("[Cannot make a triangle, Length C is too long]");

        }

        else { // if none of the conditions above return true

            System.out.println("You can make a triangle, hooray!");

        }

        scanOne.close(); // closes the Scanner

    }

}