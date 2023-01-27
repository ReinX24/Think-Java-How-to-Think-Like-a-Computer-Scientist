import java.math.BigInteger;

public class FactorialBigInt {

    public static void main(String[] args) {

        /*
         * Exercise 9.2 You might be sick of the factorial method by now, but we’re
         * going to do one more version.
         * 
         */

        // Factorials of numbers 0 - 30
        System.out.println("Factorials of 0 - 30 (int)");
        for (int i = 0; i <= 30; i++) { // for loop 0 - 30
            int factNum = 1; // where we will store the factorial of a number
            if (i == 0) { // factorial of 0 is 1
                System.out.println("Factorial of: " + i + ": " + factNum);
            } else { // factorial of 1 - 30
                for (int j = i; j > 0; j--) { // changes factNum even if outside parameters
                    factNum *= j; // multiplies factNum to current j
                }
                System.out.println("Factorial of: " + i + ": " + factNum); // displays number and its factorial
            }
        }

        /*
         * When using integers to find the factorials of large numbers, it will cause an
         * overflow which may cause to an incorrect result. To fix this, we use
         * BigInteger since it computes larger numbers better than the int data type.
         * 
         */

        // Converting factorial loop to use BigInteger
        System.out.println("Factorials of 0 - 30 (BigInteger)");
        for (int i = 0; i <= 30; i++) { // loops from 0 - 30
            BigInteger bigIntFactorial = BigInteger.valueOf(1); // where we will store our factorial for a number
            if (i == 0) { // if i is equal to 0, factorial of 0 is 1
                System.out.println("Factorial of " + i + ": " + bigIntFactorial);
            } else { // factorials of 1 - 30
                for (int j = i; j > 0; j--) { // starts from i until it is 1
                    BigInteger currentNum = BigInteger.valueOf(j); // converts int to BigInteger
                    bigIntFactorial = bigIntFactorial.multiply(currentNum); // multiplies bigIntFactorial to currentNum
                    // can only put BigInteger variables inside .multiply
                }
                System.out.println("Factorial of " + i + ": " + bigIntFactorial); // prints number and its factorial
            }
        }

    }

}
