import java.util.Scanner;

public class PracticeExpoNum {

    public static void main(String[] args) {

        /*
         * Create a program that will accept a number and find the corresponding value
         * of that number multiplied by Euler's number.
         * 
         */

        Scanner scanOne = new Scanner(System.in);
        System.out.println("[Euler's Number Calculator]");
        System.out.print("Input number: ");
        double userNum = scanOne.nextDouble(); // stores user input in userNum
        System.out.println(userNum + ": " + expoNum(userNum, 17)); // prints results
        scanOne.close(); // closes our Scanner object
        System.out.println("======================");
        // Printing Euler's number (positive & negative)
        double posNum = 0.1;
        while (posNum <= 100.0) {
            System.out.println(posNum + "\t" + Math.exp(posNum) + "\t:\t" + expoNum(posNum, 17));
            posNum *= 10;
        }
        System.out.println("======================");
        double negNum = -0.1;
        while (negNum >= -100.0) {
            System.out.println(negNum + "\t" + Math.exp(negNum) + "\t:\t" + expoNum(negNum, 17));
            negNum *= 10;
        }
    }

    public static double expoNum(double x, int n) { // method that finds corresponding Euler's number result
        double expoTemp = 1; // temporary variable for storing calculation results
        double expoResult = 1; // storing final result
        int loopCount = 1; // loop counter
        while (loopCount <= n) {
            expoTemp = expoTemp * x / loopCount; // temporarily holds calculation results
            expoResult += expoTemp; // adds result to expoResult
            loopCount++; // increment loopCount
        }
        return expoResult; // return the sum of all expoTemp results
    }

}
