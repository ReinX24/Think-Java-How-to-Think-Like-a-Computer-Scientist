import java.util.Arrays;

public class PrintingArrays {

    public static void main(String[] args) {

        // Creating an array
        
        int[] numArr = { 1, 3, 5, 7, 9 };

        // Print through array using a while loop

        int i = 0; // start position of iteration

        System.out.println("[While Loop]");
        System.out.print("{");

        while (i < numArr.length) {

            if (i == numArr.length - 1) { // if it is at the last element in the array

                System.out.print(numArr[i]);
                i++; // increments i by 1

            }

            else {

                System.out.print(numArr[i] + ",");
                i++; // increments i by 1

            }

        }

        System.out.println("}\n"); // \n to create space between printed arrays

        // For loop

        System.out.println("[For Loop]");
        System.out.print("{");

        for (int j = 0; j < numArr.length; j++) {

            if (j == numArr.length - 1) { // if the current iterated element is the last one in the array

                System.out.print(numArr[j]); // just print element without a comma

            }

            else {

                System.out.print(numArr[j] + ",");

            }

        }

        System.out.println("}\n");

        // .toString method

        System.out.println("[Arrays.toString Method]");
        System.out.println(Arrays.toString(numArr));

    }

}