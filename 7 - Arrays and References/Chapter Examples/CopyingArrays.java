import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {

        /*
         * Copying one array from another
         * 
         */

        // This does NOT copy the first array, rather, it just references the first
        // array
        double[] arrOne = new double[3];
        double[] arrTwo = arrOne;

        arrOne[0] = 12;
        System.out.println(arrOne[0]);
        System.out.println(arrTwo[0]); // displays the same element as first print statement

        // If we change the first element of the second array, it also replaces the first array element

        arrTwo[0] = 7;
        System.out.println(arrOne[0]);
        System.out.println(arrTwo[0]); // displays same element as arrOne

        // Copying arrays using a for loop

        int[] arrThree = {1, 3, 5};
        int[] arrFour = new int[arrThree.length];

        for (int i = 0; i < arrOne.length; i++) { // for loop that iterates through the first loop

            arrFour[i] = arrThree[i]; // copies elements from the first element to another element

        }

        System.out.println(Arrays.toString(arrThree));
        System.out.println(Arrays.toString(arrFour)); // prints the same elements as arrThree

        // Using the Arrays.copyOf method

        int[] arrFive = {2, 4, 6};
        int[] arrSix = Arrays.copyOf(arrFive, arrFive.length); // copies all elements of arrFive

        System.out.println(Arrays.toString(arrFive));
        System.out.println(Arrays.toString(arrSix));


    }

}
