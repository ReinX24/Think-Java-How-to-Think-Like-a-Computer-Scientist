import java.math.BigInteger;

public class PowerEncryption {

    public static void main(String[] args) {

        /*
         * Exercise 9.3 Many encryption algorithms depend on the ability to raise large
         * integers to a power. Here is a method that implements an efficient algorithm
         * for integer exponentiation:
         * 
         */

        System.out.println(powNum(3, 2));
        System.out.println(powNumFast(5, 2));
        System.out.println(powNumBigInt(17, 17));

    }

    public static int powNum(int x, int n) {
        if (n == 0) {
            return 1;
        } 
        int powNumResult = powNum(x, n - 1);
        if (n > 0) {
            return  x * powNumResult;
        } else {
            return powNumResult;
        }

    }

    public static int powNumFast (int x, int n) { // method that finds the power of a number
        if (n == 0) {
            return 1;
        }
        // find x to the n/2 recursively
        int powNumResult = powNumFast(x, n/2); 
        if (n % 2 == 0) { // if n is even, result is powerNumResult squared
            return powNumResult * powNumResult;
        } else { // if n is not even, powerNumResult squared times x
            return powNumResult * powNumResult * x;
        }
    }

    public static BigInteger powNumBigInt (int x, int n) {

        if (n == 0) {
            return BigInteger.valueOf(1); // returns BigInteger with a 1 value
        }
       
        BigInteger powBigInt = powNumBigInt(x, n/2);
        if (n % 2 == 0) {
            return powBigInt.multiply(powBigInt);
        } else {
            return powBigInt.multiply(powBigInt).multiply(BigInteger.valueOf(x));
        }

    }

}
