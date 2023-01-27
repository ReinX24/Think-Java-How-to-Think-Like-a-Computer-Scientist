public class MaxInRange {

    public static void main(String[] args) {

        /*
         * Exercise 8.6 Many of the patterns you have seen for traversing arrays can
         * also be written recursively. It is not common, but it is a useful exercise.
         * 1. Write a method called maxInRange that takes an array of integers and
         * two indexes, lowIndex and highIndex, and finds the maximum value
         * in the array, but considering only the elements between lowIndex and
         * highIndex, including both.
         * This method should be recursive. If the length of the range is 1 (i.e., if
         * lowIndex == highIndex), we know immediately that the sole element
         * in the range must be the maximum. So that’s the base case.
         * If there is more than one element in the range, we can break the array into
         * two pieces, find the maximum in each piece, and then find the maximum
         * of the maxima.
         * 
         * 2. Methods like maxInRange can be awkward to use. To find the largest
         * element in an array, we have to provide the range for the entire array:
         * double max = maxInRange(a, 0, a.length - 1);
         * Write a method called max that takes an array and uses maxInRange to
         * find and return the largest element.
         * 
         */

        int[] arrOne = { 1, 5, 3, 2, 1 };
        // System.out.println(maxInRange(arrOne, 0, arrOne.length - 1)); // prints highest number in array
        System.out.println(maxNum(arrOne));

        int[] arrTwo = { 2 };
        // System.out.println(maxInRange(arrTwo, 0, arrTwo.length - 1)); // prints the only element
        System.out.println(maxNum(arrTwo));

        int[] arrThree = {2, 4, 6, 2, 4, 2};
        System.out.println(maxNum(arrThree)); // prints highest number in array

        int[] arrFour = {5, 10, 15, 10, 5, 0};
        System.out.println(maxNum(arrFour)); // prints highest number in array

    }

    public static int maxInRange(int[] numArr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return numArr[highIndex]; // returns last number
        }
        int maxVal = maxInRange(numArr, lowIndex + 1, highIndex);
        if (numArr[lowIndex] > maxVal) {
            return numArr[lowIndex]; // sets new value for maxVal
        } else {
            return maxVal; // returns current maxVal
        }

    }

    public static int maxNum(int[] numArr) { // method that calls maxInRange
        return maxInRange(numArr, 0, numArr.length - 1);
        // instead of calling the maxInRange method and putting all parameters, you now
        // only need to put the array in the parameter
    }

}
