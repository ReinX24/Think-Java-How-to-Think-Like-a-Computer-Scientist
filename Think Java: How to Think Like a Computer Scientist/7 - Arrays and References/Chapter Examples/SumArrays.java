import java.util.Arrays;

public class SumArrays {

    public static void main(String[] args) {

        /*
         * Method that finds the sum of all the numbers in the array
         * 
         */

        double[] arrOne = { 1.43, 2.62, 6.23, 1.23, 5.23 };
        System.out.println(Arrays.toString(arrOne)); // prints the array
        System.out.printf("Sum of Array: %.2f\n", arrSum(arrOne)); // finds sum and rounds off to two decimal places

        double[] arrTwo = { 2.14, 5.23, 6.12, 8.21, 2.19 };
        System.out.println(Arrays.toString(arrTwo));
        System.out.printf("Sum of Array: %.2f\n", arrSum(arrTwo));

    }

    public static double arrSum(double[] numArr) {

        double arrTotal = 0; // where we will store

        for (int i = 0; i < numArr.length; i++) {

            arrTotal += numArr[i]; // adds each element in numArr to arrTotal

        }

        return arrTotal;

    }

}
