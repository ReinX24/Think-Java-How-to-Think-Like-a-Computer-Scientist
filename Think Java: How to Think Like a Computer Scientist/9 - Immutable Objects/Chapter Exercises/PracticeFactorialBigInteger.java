import java.math.BigInteger;
import java.util.Scanner;

public class PracticeFactorialBigInteger {

    public static void main(String[] args) {

        /*
         * Create a program that will take a number and find its factorial. Use
         * BigInteger and recursion to create a solution.
         * 
         */

        Scanner scanOne = new Scanner(System.in);

        System.out.println("[Factorial Calculator]");
        System.out.print("Input number: ");
        int userNum = scanOne.nextInt(); // storing our user input
        System.out.println("Factorial of " + userNum + ": " + bigIntFactorial(userNum)); // showing number & factorial
        scanOne.close(); // closing Scanner our Scanner object

    }

    public static BigInteger bigIntFactorial(int userNum) { // Factorial of a number using BigInteger values and methods
        BigInteger factBigInt = BigInteger.valueOf(userNum); // storing our result
        if (userNum != 0) { // if userNum is not equal to 0
            return factBigInt = factBigInt.multiply(bigIntFactorial(userNum - 1)); // calls itself recursively
        } else {
            return BigInteger.valueOf(1); // base stack, returns 1
        }
    }

}
