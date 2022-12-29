import java.util.Arrays;

public class AreFactors {

    public static void main(String[] args) {

        /*
         * Exercise 7.5 Write a method named areFactors that takes an integer n and an
         * array of integers, and returns true if the numbers in the array are all
         * factors of n (which is to say that n is divisible by all of them).
         * 
         */

        // Number that we will use to check if the array has its factors
        int factNum = 10;
        int[] factArrOne = { 1, 2, 5, 10 }; // returns true
        int[] factArrTwo = { 1, 2, 4, 8 }; // returns false
        boolean areFactorsOne = areFactors(factArrOne, factNum);
        boolean areFactorsTwo = areFactors(factArrTwo, factNum);
        System.out.println("Our Number: " + factNum);
        System.out.println("Array of potential factors 1: " + Arrays.toString(factArrOne));
        System.out.println("Array of potential factors 2: " + Arrays.toString(factArrTwo));
        System.out.println("Are all numbers in the first array factors of 10?: " + areFactorsOne);
        System.out.println("Are all numbers in the second array factors of 10?: " + areFactorsTwo);

    }

    public static boolean areFactors(int[] factArr, int factNum) {

        boolean areFactors = true; // true by default

        for (int i = 0; i < factArr.length; i++) {

            if (factNum % factArr[i] != 0) { // checks if the current iterated element is a factor of factNum
                areFactors = false; // if an element in the array is not a factor, return false
            }

        }

        return areFactors; // returns either true or false

    }

}
