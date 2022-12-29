import java.util.Arrays;

public class SievePrime {

    public static void main(String[] args) {

        // Exercise 7.4

        /*
         * Exercise 7.4 The Sieve of Eratosthenes is “a simple, ancient algorithm for
         * finding all prime numbers up to any given limit” (https://en.wikipedia.
         * org/wiki/Sieve_of_Eratosthenes).
         * Write a method called sieve that takes an integer parameter, n, and returns
         * a boolean array that indicates, for each number from 0 to n - 1, whether the
         * number is prime.
         * 
         */
        System.out.println(Arrays.toString(sieveMethod(12))); // 0 - 11
        System.out.println(Arrays.toString(sieveMethod(31))); // 0 - 30

    }

    public static boolean[] sieveMethod(int paraNum) {

        boolean[] boolArr = new boolean[paraNum]; // new array with length of paraNum
        int[] numArr = new int[paraNum];

        for (int i = 0; i < paraNum; i++) { // for loop that goes from 2 to paraNum
            // Check if current number is a prime number or not
            // Prime numbers are numbers that have only 2 factors: 1 and themselves. For
            // example, the first 5 prime numbers are 2, 3, 5, 7, and 11. By contrast,
            // numbers with more than 2 factors are call composite numbers.

            numArr[i] = i; // adds each number

            if (i == 0 || i == 1) { // 0 and 1 are not prime numbers
                boolArr[i] = false;
            }

            // 2 and 3 are the first prime numbers
            else if (i == 2 || i == 3 || i == 5) {
                boolArr[i] = true;
            }

            // Every second number is not a prime number after 2
            else if (i % 2 == 0) {
                boolArr[i] = false;
            }

            // Every third number is not a prime number after 3
            else if (i % 3 == 0) {
                boolArr[i] = false;
            }
            
            // Every fifth number is not a prime number
            else if (i % 5 == 0) {
                boolArr[i] = false;
            }

            // All remaining numbers are prime numbers
            else {
                boolArr[i] = true;
            }

        }
        System.out.println(Arrays.toString(numArr));
        return boolArr;
    }

}
