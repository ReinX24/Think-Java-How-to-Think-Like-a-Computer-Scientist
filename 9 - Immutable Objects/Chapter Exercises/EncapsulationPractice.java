import java.text.DecimalFormat;

public class EncapsulationPractice {

    public static void main(String[] args) {

        /*
         * Exercise 9.5 The goal of this exercise is to practice encapsulation and gen-
         * eralization using some of the examples in previous chapters.
         * 
         * 1. Starting with the code in Section 7.5, write a method called powArray
         * that takes a double array, a, and returns a new array that contains the
         * elements of a squared. Generalize it to take a second argument and raise
         * the elements of a to the given power.
         * 
         * 2. Starting with the code in Section 7.8, write a method called histogram
         * that takes an int array of scores from 0 to (but not including) 100, and
         * returns a histogram of 100 counters. Generalize it to take the number of
         * counters as an argument.
         * 
         */

        DecimalFormat doubleFormat = new DecimalFormat("###.###"); // object to be used to format decimals

        double[] doubleArrOne = { 1.52, 2.56, 7.23, 1.32, 5.89 };
        System.out.println("[Problem #1]");
        for (int i = 0; i < doubleArrOne.length; i++) { // printing original double array elements
            System.out.print("\t" + doubleFormat.format(doubleArrOne[i])); // .format rounds number off to 2
        }
        System.out.println(); // breaks next print statement into a new line

        doubleArrOne = powArray(doubleArrOne, 3); // replace old array with new array

        for (int i = 0; i < doubleArrOne.length; i++) { // printing new double array elements
            System.out.print("\t" + doubleFormat.format(doubleArrOne[i]));
        }
        System.out.println("\n[Problem #2]");
        int[] numArr = { 5, 7, 32, 43, 12, 35, 23, 65, 43, 78, 99 }; // our int array
        for (int i = 0; i < numArr.length; i++) {
            System.out.print("\t" + numArr[i]); // printing numArr elements
        }
        System.out.println();

        numArr = histogramInt(numArr, 100); // placing numbers in a histogram with 100 counters (0 - 99)

        for (int i = 0; i < numArr.length; i++) { 
            System.out.print("\t" + numArr[i]); // printing new numArr elements
        }
        System.out.println();

    }

    public static double[] powArray(double[] numArr, int numPow) { // takes an array and raises its elements to a number
        double[] numArrPow = new double[numArr.length]; // array for holding raised values of numArr
        for (int i = 0; i < numArr.length; i++) { // loops through numArr
            double powNumResult = 1; // storing our result
            for (int j = 0; j < numPow; j++) { // raises the number to a power
                powNumResult *= numArr[i]; // multiplies powNumResult to current numArr element in a loop
            }
            numArrPow[i] = powNumResult; // places result in corresponding index in numArrPow
        }
        return numArrPow; // returns array with numArr elements raised to numPow
    }

    public static int[] histogramInt(int[] numArr, int countNum) { // method that returns a histogram of numArr elements
        int[] histogramIntArr = new int[countNum]; // where we will be storing our historgram array
        for (int i = 0; i < numArr.length; i++) { // iterates through numArr, parameter array
            histogramIntArr[numArr[i]]++;
        }
        return histogramIntArr; // return array as histogram of numArr elements
    }

}
