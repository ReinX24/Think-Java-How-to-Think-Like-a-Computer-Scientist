import java.util.Scanner;

public class FermatApp {

    public static void main(String[] args) {

        /*
         * Fermat’s Last Theorem says that there are no integers a, b, c, and n such
         * that a n + b n = c n , except when n ≤ 2.
         * 
         * Write a program named Fermat.java that inputs four integers (a, b, c, and n)
         * and checks to see if Fermat’s theorem holds. If n is greater than 2 and
         * a^n + b^n = c^n , the program should display “Holy smokes, Fermat was wrong!”
         * Otherwise, the program should display “No, that doesn’t work.”
         * 
         * Hint: You might want to use Math.pow.
         * 
         */

        System.out.println("[Fermat’s Last Theorem]");

        // Create a Scanner object to accept user input
        Scanner scanOne = new Scanner(System.in);

        // Ask for a, b, and c
        System.out.print("Input a: ");
        int a = scanOne.nextInt();

        System.out.print("Input b: ");
        int b = scanOne.nextInt();

        System.out.print("Input c: ");
        int c = scanOne.nextInt();

        System.out.print("Input n: ");
        int n = scanOne.nextInt();

        // Check if n is greater than 2 and a^n + b^n = c^n
        if (fermatCalc(a, b, c, n)) {

            System.out.println("“Holy smokes, Fermat was wrong!”");

        }

        // If condition above returns false
        else {

            System.out.println("No, that doesn’t work.");

        }

        scanOne.close(); // closes the Scanner

    }

    // Method that checks if n is greater than 2 and a^n + b^n = c^n
    public static boolean fermatCalc(int a, int b, int c, int n) { // method that returns true or false

        return (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) && (n > 2);

    }

}