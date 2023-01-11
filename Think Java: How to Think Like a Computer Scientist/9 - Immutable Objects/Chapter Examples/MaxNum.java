import java.util.Arrays;

public class MaxNum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        /*
         * Typing java MaxNum.java will display an empty array
         * Input: java MaxNum.java 10 15 20 25 30
         * Displays: [10, 15, 20, 25, 30]
         * 
         */

        if (args.length == 0) { // if there are no arguments
            System.err.println("Usage: java MaxNum.java <numbers>");
            return; // terminates the program
        }

        // Finds the largest number in passed in set of numbers
        int maxNum = Integer.MIN_VALUE; // assigns MIN_VALUE by default
        for (String myArgs : args) { // iterates through numbers passed in main method
            int argValue = Integer.parseInt(myArgs); // turns the String into an integer
            if (argValue > maxNum) { // checks if argValue is larger than maxNum
                maxNum = argValue; // replaces maxNum with new highest number
            }
        }
        System.out.println("Max Number in Array is: " + maxNum); // displays largest number
    }
    
}
