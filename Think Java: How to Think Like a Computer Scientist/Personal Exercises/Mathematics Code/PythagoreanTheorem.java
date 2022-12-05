import java.util.InputMismatchException;
import java.util.Scanner;

public class PythagoreanTheorem {

    // Scanner to accept inputs
    static Scanner scanOne = new Scanner(System.in);

    // Variables to input our values
    // Variables need to be static so that they could be used by other classes
    static double aLeg = 0; // perpendicular
    static double bLeg = 0; // base
    static double cLeg = 0; // hypotenuse
    static boolean calcOn = true; // makes sure the calculator is on
    static int userInput = 0; // stores the user input

    public static void main(String[] args) {

        // Pythagorean Theorem:
        // Hypotenus: c = square root of a squared + b squared

        while (calcOn) {

            mainMenu();

        }

    }

    public static void mainMenu() {

        System.out.println("================================");
        System.out.println("[Pythagorean Theorem Calculator]");
        System.out.println("================================");
        System.out.println("[1] Hypotenuse");
        System.out.println("[2] Perpendicular (A leg)");
        System.out.println("[3] Base (B leg)");
        System.out.println("[4] Close the calculator");
        System.out.print("Input: ");
        userInput = scanOne.nextInt();

        // switch case for choices

        switch (userInput) {

            case 1:
                hypotenuseCalculate();
                break;
            case 2:
                perpendicularCalculate();
                break;
            case 3:
                baseCalculate();
                break;
            case 4:
                System.out.println("[Pythagorean Calculator closed!]");
                System.out.println("[Thank you for using!]");
                calcOn = false; // turns off while loop and calculator as well
                scanOne.close(); // closes the scanner
                break;
            default:
                System.out.println("==========================");
                System.out.println("[Invalid Input, try again]");
                System.out.println("==========================");
                mainMenu();
                break;

        }

    }

    public static void hypotenuseCalculate() {

        // Asking user for values
        System.out.print("Input Perpendicular or A leg: ");
        aLeg = scanOne.nextDouble();

        System.out.print("Input Base or B leg: ");
        bLeg = scanOne.nextDouble();

        // Calculate the hypotenuse
        cLeg = Math.sqrt(Math.pow(aLeg, 2) + Math.pow(bLeg, 2)); // for calculating the hypotenus

        // Show the result
        System.out.println("================================");
        System.out.printf("The hypotenuse of triangle: %.2f\n", cLeg); // roounded off to 2 decimal places

    }

    public static void perpendicularCalculate() {

        System.out.print("Input Base or B leg: ");
        bLeg = scanOne.nextDouble();

        System.out.print("Input Hypotenuse or C leg: ");
        cLeg = scanOne.nextDouble();

        if (cLeg > bLeg) { // hypotenuse needs to be longer than base

            aLeg = Math.sqrt(Math.pow(cLeg, 2) - Math.pow(bLeg, 2));

            System.out.println("================================");
            System.out.printf("The perpendicular of triangle: %.2f\n", aLeg); // shows the perpendicular of the trangle

        }

        else {

            System.out.println("[Invalid input, the hypotenuse must be greater than the base]");
            perpendicularCalculate();

        }

    }

    public static void baseCalculate() {

        System.out.print("Input Perpendicular or A leg: ");
        aLeg = scanOne.nextDouble();

        System.out.print("Input Hypotenuse or C leg: ");
        cLeg = scanOne.nextDouble();

        if (cLeg > aLeg) { // hypotenuse needs to be longer than the perpendicular

            bLeg = Math.sqrt(Math.pow(cLeg, 2) - Math.pow(aLeg, 2));

            System.out.println("================================");
            System.out.printf("The base of triangle: %.2f\n", bLeg);

        }

        else {

            System.out.println("[Invalid input, the hypotenuse must be greater than the perpendicular]");
            baseCalculate();

        }

    }

}