import java.util.InputMismatchException;
import java.util.Scanner;

public class PythagoreanTheorem {

    // Scanner to accept inputs
    static Scanner scanOne = new Scanner(System.in);

    // Variables to input our values
    // Variables need to be static so that they could be used by other classes
    static Double aLeg = 0.0; // perpendicular
    static Double bLeg = 0.0; // base
    static Double cLeg = 0.0; // hypotenuse
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

        try {

            System.out.print("Input: ");
            userInput = scanOne.nextInt();

        }

        catch (InputMismatchException ex) {

            scanOne.nextLine(); // will lead to defualt case and go back to main menu

        }

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
                closeCalculator();
                break;
            default:
                System.out.println("================================");
                System.out.println("[Invalid Input, try again]");
                mainMenu();
                break;

        }

    }

    public static void hypotenuseCalculate() {

        try {

            // Asking user for values
            System.out.print("Input Perpendicular or A leg: ");
            aLeg = scanOne.nextDouble();

            System.out.print("Input Base or B leg: ");
            bLeg = scanOne.nextDouble();

        }

        catch (InputMismatchException ex) { // executes catch block first before the else block

            System.out.println("[Not a valid input, try again]");
            scanOne.nextLine();

        }

        // Calculate the hypotenuse
        cLeg = Math.sqrt(Math.pow(aLeg, 2) + Math.pow(bLeg, 2)); // for calculating the hypotenus

        // Show the result

        if (cLeg != 0) { // it is impossible for a hypotenuse to have a length of zero

            System.out.println("================================");
            System.out.printf("The hypotenuse of triangle: %.2f\n", cLeg); // roounded off to 2 decimal places
            resetNum(); // resets the numbers

        }

        else {

            resetNum();
            hypotenuseCalculate();

        }

    }

    public static void perpendicularCalculate() {

        try {

            System.out.print("Input Base or B leg: ");
            bLeg = scanOne.nextDouble();

            System.out.print("Input Hypotenuse or C leg: ");
            cLeg = scanOne.nextDouble();

        }

        catch (InputMismatchException ex) {

            System.out.println("[Not a valid input, try again]");
            scanOne.nextLine(); // goes to else block

        }

        if (cLeg > bLeg) { // hypotenuse needs to be longer than base

            aLeg = Math.sqrt(Math.pow(cLeg, 2) - Math.pow(bLeg, 2));

            System.out.println("================================");
            System.out.printf("The perpendicular of triangle: %.2f\n", aLeg); // shows the perpendicular of the trangle
            resetNum();

        }

        else if (cLeg < bLeg) {

            System.out.println("[Invalid input, the hypotenuse must be greater than the base]");
            resetNum();
            perpendicularCalculate();

        }

        else { // executes when an exception occurs

            resetNum();
            perpendicularCalculate();

        }

    }

    public static void baseCalculate() {

        try {

            System.out.print("Input Perpendicular or A leg: ");
            aLeg = scanOne.nextDouble();

            System.out.print("Input Hypotenuse or C leg: ");
            cLeg = scanOne.nextDouble();

        }

        catch (InputMismatchException ex) {

            System.out.println("[Not a valid input, try again]");
            scanOne.nextLine(); // goes to else block

        }

        if (cLeg > aLeg) { // hypotenuse needs to be longer than the perpendicular

            bLeg = Math.sqrt(Math.pow(cLeg, 2) - Math.pow(aLeg, 2));

            System.out.println("================================");
            System.out.printf("The base of triangle: %.2f\n", bLeg);
            resetNum();

        }

        else if (cLeg < aLeg) {

            System.out.println("[Invalid input, the hypotenuse must be greater than the perpendicular]");
            resetNum();
            baseCalculate();

        }

        else {

            resetNum();
            baseCalculate();

        }

    }

    public static void closeCalculator() {

        System.out.println("[Pythagorean Calculator closed!]");
        System.out.println("[Thank you for using!]");
        calcOn = false; // turns off while loop and calculator as well
        scanOne.close(); // closes the scanner

    }

    public static void resetNum() {

        aLeg = 0.0;
        bLeg = 0.0;
        cLeg = 0.0;

    }

}