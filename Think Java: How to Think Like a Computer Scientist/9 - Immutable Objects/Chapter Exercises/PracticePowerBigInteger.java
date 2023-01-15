import java.math.BigInteger;
import java.util.Scanner;

public class PracticePowerBigInteger {

    public static void main(String[] args) {

        /*
         * Create a program that will take 2 numbers, the first will be the base number
         * and the second will be the exponent that we will raise the base number to.
         * Create a method that will take these 2 numbers and return a BigInteger of
         * the base number raised to the exponent.
         * 
         */

        Scanner scanOne = new Scanner(System.in);
        System.out.println("[Power of a Number Calculator]");
        System.out.print("Input base number: ");
        int baseNum = scanOne.nextInt(); // storing base number
        System.out.print("Input exponent: ");
        int expoNum = scanOne.nextInt(); // storing exponent
        System.out.println("[Normal Method]");
        System.out.println(baseNum + " ^ " + expoNum + " = " + powBigInteger(baseNum, expoNum)); // printing results
        System.out.println("[Fast Method]");
        System.out.println(baseNum + " ^ " + expoNum + " = " + powBigIntegerFast(baseNum, expoNum)); // printing results
        scanOne.close();

    }

    public static BigInteger powBigInteger(int x, int n) { // slow method that finds the power of(n) of x
        if (n != 0) { // if n is not equal to 0
            return BigInteger.valueOf(x).multiply(powBigInteger(x, n - 1)); // return x * powBigInteger(x, n - 1);
        } else {
            return BigInteger.valueOf(1);
        }
    }

    public static BigInteger powBigIntegerFast(int x, int n) { // fast method that finds the power(n) of x
        if (n == 0) { // base stack
            return BigInteger.valueOf(1);
        }
        BigInteger powIntResult = powBigIntegerFast(x, n / 2); // where we will store our result
        if (n % 2 == 0) { // if n is divisible by 2
            return powIntResult = powIntResult.multiply(powIntResult); // powIntResult * powIntResult;
        } else {
            return powIntResult = powIntResult.multiply(powIntResult).multiply(BigInteger.valueOf(x));
            // powIntResult * powIntResult * x;
        }
    }

}
