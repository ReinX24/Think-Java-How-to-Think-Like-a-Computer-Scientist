import java.util.Arrays;

public class ArePrimeFactors {

    public static void main(String[] args) {

        /*
         * Exercise 7.6 Write a method named arePrimeFactors that takes an integer n and
         * an array of integers, and that returns true if the numbers in the array are
         * all prime and their product is n.
         * 
         */

        int nOne = 10;
        int[] nArrOne = { 2, 5 }; // returns true
        int[] nArrTwo = { 2, 3, 5 }; // returns false
        System.out.println("Our number: " + nOne);
        System.out.println("Array 1: " + Arrays.toString(nArrOne));
        System.out.println("Array 2: " + Arrays.toString(nArrTwo));
        System.out.println("Array 1 Elements are Prime Factors: " + arePrimeFactors(nOne, nArrOne));
        System.out.println("Array 2 Elements are Prime Factors: " + arePrimeFactors(nOne, nArrTwo));

    }

    public static boolean arePrimeFactors(int n, int[] numArr) {

        boolean arePrimeFactors = true; // true by default
        // Check if all the numbers are prime
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0 || numArr[i] == 1) {
                arePrimeFactors = false; // 0 & 1 are prime numbers
                return arePrimeFactors; // returns false immediately
            } else if (numArr[i] == 2 || numArr[i] == 3 || numArr[i] == 5) { // 2, 3, and 5 are prime numbers
                arePrimeFactors = true;
            } else if (numArr[i] % 2 == 0) { // every second number from 2 is a prime number
                arePrimeFactors = false;
                return arePrimeFactors;
            } else if (numArr[i] % 3 == 0) { // every third number from 3 is a prime number
                arePrimeFactors = false;
                return arePrimeFactors;
            } else if (numArr[i] % 5 == 0) { // every fifth number from 5 is a prime number
                arePrimeFactors = false;
                return arePrimeFactors;
            } else {
                arePrimeFactors = true;
            } // if all remaining numbers are prime factors
        }

        // After checking if all of the numbers are prime numbers, we now check if those
        // numbers are a product of n
        int productNum = 1;
        for (int i = 0; i < numArr.length; i++) {
            productNum = productNum * numArr[i]; // multiplies all the elements in the array
        }

        if (productNum != n) { // if the product of all the numbers are not equal to n, return false
            arePrimeFactors = false;
            return arePrimeFactors;
        }
        return arePrimeFactors; // returns true if default boolean is not affected
    }

}
