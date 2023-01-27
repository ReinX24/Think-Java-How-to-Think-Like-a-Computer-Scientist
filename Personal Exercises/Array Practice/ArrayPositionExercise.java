public class ArrayPositionExercise {

    public static void main(String[] args) {

        /*
         * Do an exercise that will turn the following:
         * 
         * [1, 2, 3]
         * [4, 5, 6]
         * [7, 8, 9]
         * 
         * Into:
         * 
         * [1, 4, 7]
         * [2, 5, 8]
         * [3, 6, 9]
         * 
         */

        // 2D array that will contain all of our numbers
        int[][] numArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // 2D array that will contain the new set of numbers
        int[][] newNumArray = new int[3][3];

        // For each loops that will iterate through the numArray

        for (int i = 0; i < numArray.length; i++) { // for outer array

            for (int j = 0; j < numArray[i].length; j++) { // for inner array

                if (numArray[i][j] == numArray[i][j]) {

                    newNumArray[j][i] = numArray[i][j];

                    // Logic Explanation for new array
                    // j = 0, 1, 2 (outer arrays iterated through)
                    // i = 0 (first element of each of these arrays)
                    // loop break
                    // j = 0, 1, 2
                    // i = 1
                    // loop break
                    // j = 0, 1, 2
                    // i = 2
                    // loop break
                    // looping ends

                }

            }

        }

        // Printing the old an new array
        System.out.println("Old Array: ");
        for (int i = 0; i < numArray.length; i++) { // for outer array

            for (int j = 0; j < numArray[i].length; j++) { // for inner array

                System.out.print(" | " + numArray[i][j] + " | "); // prints elements of each array

            }

            System.out.println(); // makes a new line after printing the inner array elements

        }

        System.out.println("New Array: ");
        for (int i = 0; i < newNumArray.length; i++) { // for outer array

            for (int j = 0; j < newNumArray[i].length; j++) { // for inner array

                System.out.print(" | " + newNumArray[i][j] + " | "); // prints elements of each array

            }

            System.out.println(); // makes a new line after printing the inner array elements

        }
    }
}