public class DoubloonPractice {

    public static void main(String[] args) {

        /*
         * A word is said to be a “doubloon” if every letter that appears in
         * the word appears exactly twice. Write a method called isDoubloon
         * that takes a string and checks whether it is a doubloon. To ignore
         * case, invoke the toLowerCase method before checking.
         * 
         */

        // First, we will create a String array
        String[] strArr = { "Abba", "Anna", "appall", "appearer", "lama", "mana" };
        // All of the Strings in the array are considered to be doubloons except for the
        // last one

        for (int i = 0; i < strArr.length; i++) { // iterates through the array

            boolean isDoubloon = isDoubloon(strArr[i]);

            if (isDoubloon) { // if isDoubloon returns true

                System.out.println(strArr[i] + " : Doubloon");

            }

            else { // if not, the String is not a doubloon

                System.out.println(strArr[i] + " : X");

            }

        }

    }

    // Method that checks if a word is a doubloon or not
    public static boolean isDoubloon(String strArr) {

        strArr = strArr.toLowerCase(); // make the String lowercase
        int[] charIndex = new int[26]; // int array to count each char instance in String

        for (int i = 0; i < strArr.length(); i++) { // adding the characters to their positions in array

            char strChar = strArr.charAt(i); // store current character in strChar
            int charNum = strChar - 'a'; // subtract strChar by a(1)

            /*
             * a - a(1) = 0; stores at index 0
             * b - a = 1; index 1
             * c - a = 2; index 2
             * etc.
             * 
             */

            charIndex[charNum]++; // increments the corresponding character index

        }

        for (int eachIndex : charIndex) {

            if (eachIndex != 0 && eachIndex != 2) {
                // A String could only be considered a doubloon when it occurs exactly twice
                // If a letter only occurs one time, the String is not a doubloon ( != 0)
                // The integer array must only contain 2 and 0 for String to be a doubloon
                return false; // returns false immediately

            }

        }

        return true; // returns true if the for loop does not return false

    }

}
