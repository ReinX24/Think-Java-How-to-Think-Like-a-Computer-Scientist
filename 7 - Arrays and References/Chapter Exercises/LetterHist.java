public class LetterHist {

    public static void main(String[] args) {

        /*
         * Exercise 7.7 Write a method called letterHist that takes a string as a
         * parameter and returns a histogram of the letters in the string. The zeroth
         * element of the histogram should contain the number of a’s in the string
         * (upper- and lowercase); the 25th element should contain the number of z’s.
         * Your solution should traverse the string only once.
         * 
         */

        int[] arrOne = letterHist("Fracture"); // returns an array histogram of the word

        for (int i = 0; i < arrOne.length; i++) { // printing the array
            System.out.print(arrOne[i] + ",");
        }

        System.out.println(); // breaks console into a new line

    }

    public static int[] letterHist(String myString) {

        int[] histArr = new int[26]; // array that will serve as our histogram
        myString = myString.toLowerCase(); // makes the String lowercase
        for (int i = 0; i < myString.length(); i++) { // iterates through the array
            int charIndex = myString.charAt(i) - 'a'; // 'a(1)' - 'a' = 0, 'b(2)' - 'a' = 1
            histArr[charIndex]++; // increments index (0 for a, 1 for b, etc...)
        }
        return histArr; // returning the array

    }

}
