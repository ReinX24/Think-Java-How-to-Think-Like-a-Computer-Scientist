public class IndexOfMax {

    public static void main(String[] args) {

        // Exercise 7.3

        /*
         * Write a method called indexOfMax that takes an array of integers and returns
         * the index of the largest element. Can you write this method by using an
         * enhanced for loop? Why or why not?
         * 
         * Ans: We cannot write this method using an enhanced for loop because it does
         * not show us the index of the element.
         * 
         */

        String[] strArr = { "Breeze", "Haven", "Bind", "Fracture", "Icebox" }; // String array
        // the longest String should be Fracture with the index of 3
        int numIndex = indexOfMax(strArr);
        System.out.println("Index of the longest array: " + numIndex);

    }

    public static int indexOfMax(String[] myArr) {

        int maxIndex = 0; // assigns 0 by default
        int strLength = myArr[0].length(); // stores the first String length
        String longString = myArr[0]; // stores first String

        for (int i = 0; i < myArr.length; i++) { // loops through the array

            if (strLength < myArr[i].length()) { // compares the current String length to the iterated String
                // if the current strLength is shorter than the current String, assign a new
                // longest length
                maxIndex = i; // store the index of the new largest String in maxIndex
                strLength = myArr[i].length(); // assigns new longest length to strLength
                longString = myArr[i]; // new longest String in longString
            }

        }

        System.out.println("Longest String is: " + longString); // displays longest String
        System.out.println("Longest String length: " + strLength); // displays longest String length
        return maxIndex; // only returns the index

    }

}
