import java.util.Random;

public class RandomArrayPrint {

    public static void main(String[] args) {

        /*
         * Create 2 methods, the first creating an array with the size as its parameter
         * and the second prints the array.
         * 
         */

        int[] arrOne = randomArray(12); // creates an array with parameter number as size
        printArray(arrOne); // prints the array

        int[] arrTwo = randomArray(10);
        printArray(arrTwo);

    }

    // Method that creates an array with random numbers
    public static int[] randomArray(int arrSize) {

        Random ranOne = new Random(); // creating a random object
        int[] randomArr = new int[arrSize]; // creating an array with parameter arrSize

        for (int i = 0; i < arrSize; i++) { // for loop that adds random numbers to array

            randomArr[i] = ranOne.nextInt(10); // adds a random number from 0(inclusive) to 10(exclusive)

        }

        return randomArr; // returns the array with random numbers

    }

    // Method that prints the array
    public static void printArray(int[] numArr) {

        System.out.print("{ ");
        // For loop that prints the array elements
        for (int i = 0; i < numArr.length; i++) {

            if (i == numArr.length - 1) { // if at the end of the array, print closing bracket

                System.out.println(numArr[i] + " }");

            }

            else { // print a comma after each array element

                System.out.print(numArr[i] + " , ");

            }

        }

    }

}
