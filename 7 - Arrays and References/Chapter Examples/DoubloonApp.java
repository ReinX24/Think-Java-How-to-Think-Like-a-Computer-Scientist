public class DoubloonApp {

    public static void main(String[] args) {

        /*
         * A word is said to be a “doubloon” if every letter that appears in
         * the word appears exactly twice. Write a method called isDoubloon
         * that takes a string and checks whether it is a doubloon. To ignore
         * case, invoke the toLowerCase method before checking.
         * 
         */

        // First, we will create a String array
        String[] strArr = { "Abba", "Anna", "appall", "appearer", "lama" };
        // All of the Strings in the array are considered to be doubloons except for the
        // last one

        for (int i = 0; i < strArr.length; i++) { // iterates through the array

            boolean isDoubloon = false;
            isDoubloon = isDoubloon(strArr[i]);

            if (isDoubloon) {

                System.out.println(strArr[i] + " is a doubloon!");

            }

            else {

                System.out.println(strArr[i] + " X");

            }

        }

    }

    public static boolean isDoubloon(String strArr) {

        strArr = strArr.toLowerCase(); // makes the String lowercase

        int[] charCount = new int[26];
        // array with 26 characters, for holding each char in String with their int
        // equivalent

        for (int i = 0; i < strArr.length(); i++) {

            char perChar = strArr.charAt(i); // assigns current character to perChar
            int charIndex = perChar - 'a'; // a - a(1) = 0, b - a = 1, c - a = 2, etc.
            charCount[charIndex]++;

        }

        // After looping the counts of each letter, we now check if each letter appears
        // zero or two times

        for (int eachChar : charCount) {

            if (eachChar != 0 && eachChar != 2) {
                // if a count is not zero and not 2, return false for it is not a doubloon
                return false; // returns false immediately, return below does not run

            }

        }

        return true;

    }

}
