import java.util.Random;

public class HistorgramApp {

    public static void main(String[] args) {

        /*
         * Creating a histogram for exam scores.
         * 
         */

        // Create an array with random number
        int[] arrOne = randomArray(10); // returns a random array with 10 elements
        printArray(arrOne); // prints the array

        // Find the amount of numbers between 90 - 100 in the array
        int countOne = inRange(arrOne, 90, 100);
        System.out.println("Numbers >= 90 & < 100 : " + countOne);
        int countTwo = inRange(arrOne, 80, 90);
        System.out.println("Numbers >= 80 & < 90 : " + countTwo);
        int countThree = inRange(arrOne, 70, 80);
        System.out.println("Numbers >= 70 & < 80 : " + countThree);

        // Making a counter for each individual number
        int[] countNumArr = new int[100]; // creates an array with 100 elements, starts from 0

        // for (int i = 0; i < arrOne.length; i++) { // for loop that loops through our first array

        //     // countNum[i] = inRange(arrOne, i, i + 1); // individually checks each number
        //     // in array
        //     // we could make this more efficient since invoking the inRange method for each
        //     // loop is not as efficient

        //     // Another way of doing it is this, which is more efficient
        //     int numIndex = arrOne[i]; // we assign the current iterated number in numIndex
        //     countNumArr[numIndex]++; // finds same index in array equal to numIndex in countNumArr and increment it

        // }

        // Instead of using a for loop, we use a for each loop
        for (int eachNum : arrOne) {

            countNumArr[eachNum]++; // increments the corresponding number in number index array

        }

        printArray(countNumArr); // prints the array

    }

    // Method that accepts an array and 2 integers
    // This method finds how many elements are inbewtween numLow and numHigh
    public static int inRange(int[] numArr, int numLow, int numHigh) {

        int numCount = 0; // will be our counter of elements

        for (int i = 0; i < numArr.length; i++) { // for loop that iterates through the array

            // If the number is greater than or equal than numLow but less than numHigh
            if (numArr[i] >= numLow && numArr[i] < numHigh) { // ex. 80 - 89, 90 - 99
                // we only do < to keep us from counting scores twice

                numCount++; // for every similar number in range, print a number counter

            }

        }

        return numCount; // returns the amound of elements in respect to the range

    }

    // Method that creates a random array
    public static int[] randomArray(int arrSize) {

        Random ranOne = new Random(); // random object to access random methods
        int[] ranArr = new int[arrSize]; // creates a new array with the size of arrSize

        for (int i = 0; i < arrSize; i++) { // adds random numbers in the array

            ranArr[i] = ranOne.nextInt(100); // random number will be >= 0 but < 100

        }

        return ranArr; // returns the array after adding random elements

    }

    // Method that prints the array
    public static void printArray(int[] numArr) {

        System.out.print("{ ");
        for (int i = 0; i < numArr.length; i++) {

            if (i == numArr.length - 1) { // if the loop is at the end, print the closing bracket

                System.out.println(numArr[i] + " }");

            }

            else { // print comma after each element

                System.out.print(numArr[i] + ",");

            }

        }

    }

}
