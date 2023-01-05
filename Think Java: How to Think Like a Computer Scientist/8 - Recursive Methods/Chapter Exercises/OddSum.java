public class OddSum {

    public static void main(String[] args) {

        /*
         * Exercise 8.2 Write a recursive method named oddSum that takes a positive
         * odd integer n and returns the sum of odd integers from 1 to n. Start with
         * a base case, and use temporary variables to debug your solution. You might
         * find it helpful to print the value of n each time oddSum is invoked.
         * 
         */

        System.out.println(oddSum(5));

    }

    public static int oddSum(int endOdd) {
        int sumNum = 0; // storing the sum of all odd numbers
        if (endOdd <= 0) { // base case
            return 0;
        }
        sumNum = oddSum(endOdd - 1);
        if (endOdd % 2 != 0) { // if the number is an odd number
            return sumNum + endOdd; // add current odd number to sumNum
        } else {
            return sumNum; // just returns the past number without adding
        }
    }
}
